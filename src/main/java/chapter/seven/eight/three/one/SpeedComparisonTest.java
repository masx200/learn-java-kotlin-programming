package chapter.seven.eight.three.one;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Scanner;
import java.util.zip.CRC32;

public class SpeedComparisonTest {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入压缩文件路径名:");
        String filename = in.nextLine();
        System.out.println("Input Stream:");         //文件流(Plain Input Stream)
        long start = System.currentTimeMillis();       //起始时间
        long crcValue = checksumInputStream(filename); //调用成员方法
        long end = System.currentTimeMillis();         //终止时间
        System.out.println(Long.toHexString(crcValue)); //显示校验和
        System.out.println((end - start) + " milliseconDs");  //显示运行时间
        System.out.println("Buffered Input Stream:");        //缓冲流
        start = System.currentTimeMillis();
        crcValue = checksumBufferedInputStream(filename);
        end = System.currentTimeMillis();
        System.out.println(Long.toHexString(crcValue));
        System.out.println((end - start) + " milliseconDs");
        System.out.println("Random Access File:");  //随机文件访问流
        start = System.currentTimeMillis();
        crcValue = checksumRandomAccessFile(filename);
        end = System.currentTimeMillis();
        System.out.println(Long.toHexString(crcValue));
        System.out.println((end - start) + " milliseconDs");
        System.out.println("Mapped File:");   //内存映射流
        start = System.currentTimeMillis();
        crcValue = checksumMappedFile(filename);
        end = System.currentTimeMillis();
        System.out.println(Long.toHexString(crcValue));
        System.out.println((end - start) + " milliseconds");
    }

    public static long checksumInputStream(String filename) throws IOException {
        //无格式文件流(Plain Input Stream)
        try (InputStream in = new FileInputStream(filename)) {
            CRC32 crc = new CRC32();    //建立CRC32 对象
            int c;
            while ((c = in.read()) != -1) {
                crc.update(c); //只要读文件未结束,就进行CRC 更新
            }
            return crc.getValue();     //返回校验和
        }

    }

    public static long checksumBufferedInputStream(String filename) throws IOException {
        //带缓冲的二进制文件流
        try (InputStream in = new BufferedInputStream(new FileInputStream(filename))) {
            CRC32 crc = new CRC32();
            int c;
            while ((c = in.read()) != -1) {
                crc.update(c);
            }
            return crc.getValue();
        }

    }

    public static long checksumRandomAccessFile(String filename) throws IOException {
        //随机文件访问流。"r"表示只读方式
        try (RandomAccessFile file = new RandomAccessFile(filename, "r")) {

            long length = file.length();   //文件长
            CRC32 crc = new CRC32();
            for (long p = 0; p < length; p++) { //用计数循环
                file.seek(p);                 //字节索引
                int c = file.readByte();      //读字节
                crc.update(c);
            }
            return crc.getValue();
        }
    }

    public static long checksumMappedFile(String filename) throws IOException {
        try (FileInputStream in = new FileInputStream(filename)) {
            FileChannel channel = in.getChannel();  //文件通道赋值
            CRC32 crc = new CRC32();
            int length = (int) channel.size();       //通道参数:文件长
            MappedByteBuffer buffer =               //用文件通道获取内存映像
                    channel.map(FileChannel.MapMode.READ_ONLY, 0, length);
            for (int p = 0; p < length; p++) {
                int c = buffer.get(p);                 //在内存中取源操作数
                crc.update(c);
            }
            return crc.getValue();
        }
    }
}
