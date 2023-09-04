package chapter.seven.two.three.one;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomFileTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("王海", 75000, 1987, 12, 15);
        staff[1] = new Employee("李明", 50000, 1989, 10, 1);
        staff[2] = new Employee("周晓", 40000, 1990, 3, 15);
        try {
            DataOutputStream out =   /*字节文件流。实现了DataOutput 接口。以二进制文件输出流为参数 */
                    new DataOutputStream(new FileOutputStream("employee.dat"));
            for (Employee e : staff) {
                e.writeData(out);
            }
            out.close();
            //以二进制数据文件为参数,建立RandomAccessFile 对象。"r"为"只读"
            RandomAccessFile in = new RandomAccessFile("employee.dat", "r");
            int n = (int) (in.length() / Employee.RECORD_SIZE);
            Employee[] newStaff = new Employee[n];
            for (int i = n - 1; i >= 0; i--) {
                newStaff[i] = new Employee();
                in.seek((long) i * Employee.RECORD_SIZE); //寻找
                newStaff[i].readdata(in);    //调用附属类成员方法
            }
            in.close();
            for (Employee e : newStaff) {
                System.out.println(e); //遍历数组newStaff的元素e
            }
        } catch (IOException e) {  //捕获IO 异常,异常传递链的终点
            e.printStackTrace();
        }
    }
}
