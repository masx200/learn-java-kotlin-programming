package chapter.five.five.three.one;

import java.util.Random;

class Employee {
    private static int nextID;  //静态整数:nextID

    static {  //静态初始化块
        Random generator = new Random(); //建立随机数对象
        nextID = generator.nextInt(10000); //10000 以内的随机数
    }

    private final int ID;
    private String name = " ";
    private double salary;

    {
        ID = nextID;
        nextID++;
    }

    public Employee(String n, double s) {  //第一个构造方法:2 个参数
        name = n;      //姓名
        salary = s;    //年薪
    }                //齐全

    public Employee(double s) {   //第二个构造方法:1 个参数
        this("Employee #" + nextID, s); //使用"this"关键字可以从一个构造方法中
    }         //调用其他构造方法

    public Employee() {  //第三个构造方法:0 个参数
        //name 默认值为"" ,salary 默认值为0,ID 号由静态初始化块获得
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getID() {
        return ID;
    }
}
