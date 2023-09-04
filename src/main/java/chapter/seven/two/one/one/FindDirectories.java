package chapter.seven.two.one.one;

import java.io.File;
import java.io.IOException;

public class FindDirectories {
    public static void main(String[] args) {
        if (args.length == 0) {
            args = new String[]{"."};
        }
        try {
            File pathName = new File(args[0]);    //建立文件(目录)对象
            String[] fileNames = pathName.list();   //路径文件名数组赋值
            if (fileNames != null) {
                for (String fileName : fileNames) {
                    File f = new File(pathName.getPath(), fileName);
                    if (f.isDirectory()) {
                        System.out.println(f.getCanonicalPath());      //输出规范文件路径
                        main(new String[]{f.getPath()});      //遍历所有子目录
                    }
                }
            }
        } catch (IOException e) {    //捕捉IO 异常
            e.printStackTrace();
        }
    }
}
