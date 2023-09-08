package chapter.seven.five.one;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

class Employee implements Serializable {  //对象串行化
    private String name = "";
    private double salary;
    private Date hireDay;

    public Employee() {
    }

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
        return getClass().getName() + "[姓名=" + name + ",年薪=" + salary + ",工龄=" + hireDay + "]";
    }
}
