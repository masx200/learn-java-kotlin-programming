package chapter.five.four.four.one;

import java.util.Date;
import java.util.GregorianCalendar;

class Employee extends Person {       //继承抽象类的子类
    private final double salary;
    private final Date hireday;

    public Employee(String n, double s, int year, int month, int day) {
        super(n);
        salary = s;
        GregorianCalendar Calendar = new GregorianCalendar(year, month - 1, day);
        hireday = Calendar.getTime();
    }

    public String getDescription() {  //实现抽象方法
        return String.format("公司雇员,年薪是% .2f。", salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", hireday=" + hireday +
                "} " + super.toString();
    }
}
