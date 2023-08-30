package com.liming.mypackage;

public class Employee               //包中的类都是public 的
        implements Comparable<Employee> {    //实现接口
    private final String name;
    private final double salary;

    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int compareTo(Employee other) {      //实现接口中的抽象方法
        return Double.compare(other.salary, salary);     //提供给Arrays.sort(staff);
    }
}
