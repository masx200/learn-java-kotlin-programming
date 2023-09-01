package chapter.five.two.one;

import java.util.Date;
import java.util.GregorianCalendar;

class Employee {
    private final String name;
    private final double salary;
    private final Date hireday;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        GregorianCalendar Calendar = new GregorianCalendar(year, month - 1, day);
        hireday = Calendar.getTime();
    }

    public boolean equals(Object otherObject) {    //对于Object 的方法覆盖
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;
        Employee other = (Employee) otherObject;
        return name.equals(other.name) && salary == other.salary && hireday.equals(other.hireday);
    }

    public int hashCode() {         //对于Object 的方法覆盖
        return 7 * name.hashCode() + 11 * new Double(salary).hashCode() + 13 * hireday.hashCode();
    }

    public String toString() {      //对于Object 的方法覆盖
        return getClass().getName() + " [name = " + name + ",salary = " + salary + ",hireday = " + hireday + "]";
    }
}
