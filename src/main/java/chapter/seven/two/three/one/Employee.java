package chapter.seven.two.three.one;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;

class Employee {
    public static final int NAME_SIZE = 40;  //姓名按照40 个字符设计
    public static final int RECORD_SIZE = 2 * NAME_SIZE + 8 + 4 + 4 + 4;
    private String name = "";  //2  40 = 80 个字节
    private double salary;  //64 个bit,占8 个字节
    private Date hireDay;  //(3  32 bit),3  4 = 12 个字节

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
        salary += salary * byPercent / 100;
    }

    public String toString() {
        return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
    }

    public void writeData(DataOutput out) throws IOException {
        DataIO.writeFixedString(name, NAME_SIZE, out);
        out.writeDouble(salary);
        GregorianCalendar Calendar = new GregorianCalendar();
        Calendar.setTime(hireDay);
        out.writeInt(Calendar.get(java.util.Calendar.YEAR));
        out.writeInt(Calendar.get(java.util.Calendar.MONTH) + 1);
        out.writeInt(Calendar.get(java.util.Calendar.DAY_OF_MONTH));
    }

    public void readdata(DataInput in) throws IOException {
        name = DataIO.readFixedString(NAME_SIZE, in);
        salary = in.readDouble();
        int y = in.readInt();
        int m = in.readInt();
        int D = in.readInt();
        GregorianCalendar Calendar = new GregorianCalendar(y, m - 1, D);
        hireDay = Calendar.getTime();
    }
} //每个记录100 个字节
