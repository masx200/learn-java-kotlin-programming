package chapter.seven.four.two.one;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class TextFileTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("王海", 75000, 1987, 12, 15);
        staff[1] = new Employee("李明", 50000, 1989, 10, 1);
        staff[2] = new Employee("周晓", 40000, 1990, 3, 15);
        System.out.println(Arrays.toString(staff));
        try {
            PrintWriter out = new PrintWriter("employee.dat");
            writeData(staff, out);  //主类成员方法
            out.close();  //注意写完要及时关闭PrintWriter 流
            Scanner in = new Scanner(new FileReader("employee.dat"));
            Employee[] newStaff = readData(in);  //主类成员方法
            in.close();  //读完要及时关闭Scanner 对象
            for (Employee e : newStaff) {
                System.out.println(e);  //打印(toString())对象
            }
            System.out.println(Arrays.toString(newStaff));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private static void writeData(Employee[] employees, PrintWriter out) throws IOException {
        out.println(employees.length);
        for (Employee e : employees) {
            e.writeData(out);  //附属类成员方法
        }
    }

    private static Employee[] readData(Scanner in) {
        int n = in.nextInt();
        in.nextLine();      //下一行输入的是一个字符串
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            employees[i] = new Employee();
            employees[i].readData(in);  //附属类成员方法
        }
        return employees;
    }
}
