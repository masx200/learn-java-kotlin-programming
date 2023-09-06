package chapter.seven.four.two.one;

import java.io.PrintWriter;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

class Employee {
    private String name = "";
    private double salary;
    private Date hireDay;

    public Employee() {
    }    //为语句new Employee()所调用

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        GregorianCalendar Calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = Calendar.getTime();
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String toString() {
        return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
    }

    public void writeData(PrintWriter out) {        //PrintWriter 是字符流。
        GregorianCalendar Calendar = new GregorianCalendar();
        Calendar.setTime(hireDay);
        out.println(name + " | " + salary + " | " + Calendar.get(java.util.Calendar.YEAR) + " | " + (Calendar.get(java.util.Calendar.MONTH) + 1) + " | " + Calendar.get(java.util.Calendar.DAY_OF_MONTH));
    }

    public void readData(Scanner in) {
        String line = in.nextLine();
        String[] tokens = line.split(" \\| ");     //取分隔符数组
        name = tokens[0];  //name 的类型是String
        salary = Double.parseDouble(tokens[1]);     //将字符串转换成double 数据类型
        int y = Integer.parseInt(tokens[2]);        //将字符串转换成int 数据类型
        int m = Integer.parseInt(tokens[3]);
        int d = Integer.parseInt(tokens[4]);
        GregorianCalendar Calendar = new GregorianCalendar(y, m - 1, d);
        hireDay = Calendar.getTime();               //最终将字符串恢复成对象
    }
}
