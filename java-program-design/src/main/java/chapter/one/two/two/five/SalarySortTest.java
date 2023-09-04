package chapter.one.two.two.five;

import com.liming.mypackage.Employee;

import java.util.Arrays;

public class SalarySortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];     //Employee 类在自编包中
        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 75000);
        staff[2] = new Employee("Tony Tester", 38000);
        Arrays.sort(staff);                  //以对象数组staff 为参数
        for (Employee e : staff)                //依次打印对象数组staff 的元素e
        {
            System.out.println("name=" + e.getName() + ",salary =" + e.getSalary());
        }
    }
}