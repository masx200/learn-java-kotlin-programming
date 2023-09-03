package chapter.five.five.three.one;

public class MethodOverloadingTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];       //构造方法数组
        staff[0] = new Employee("张浩", 40000); //两个参数
        staff[1] = new Employee(60000);          //一个参数
        staff[2] = new Employee();               //无参数
        for (Employee e : staff)                  //将构造方法数组打印出来
        {
            System.out.println("name = " + e.getName() + ",id = " + e.getID() + ",salary = " + e.getSalary());
        }
    }
}

