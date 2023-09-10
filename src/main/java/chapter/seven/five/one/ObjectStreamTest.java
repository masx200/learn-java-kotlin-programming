package chapter.seven.five.one;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectStreamTest {
    public static void main(String[] args) {
        Employee wanghai = new Employee("王海", 50000, 1989, 10, 1);
        Manager liming = new Manager("李明", 80000, 1987, 12, 15);
        liming.setSecretary(wanghai);
        Manager zhouxiao = new Manager("周晓", 40000, 1990, 3, 15);
        zhouxiao.setSecretary(wanghai);
        Employee[] staff = new Employee[3];
        staff[0] = liming;
        staff[1] = wanghai;
        staff[2] = zhouxiao;
        System.out.println(Arrays.toString(staff));
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.dat"));
            out.writeObject(staff);  //写对象数组
            out.close();             //注意写完及时关闭对象流
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.dat"));
            Employee[] newStaff = (Employee[]) in.readObject(); //读对象数组
            in.close();    //注意读完及时关闭对象流
            newStaff[1].raiseSalary(10); //将秘书王海的年薪增加10%
            for (Employee e : newStaff) {
                System.out.println(e); //将新的对象数组打印出来
            }
            System.out.println(Arrays.toString(newStaff));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

