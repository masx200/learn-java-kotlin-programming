package chapter_one.two.two.two;


public class TestMemberVariable {
    public static void main(String[] args) {
        Circle c = new Circle();          //Circle()是Circle 类的构造方法
        c.radius = 10;                    //对实例变量赋初值
        System.out.println(Circle.PI);    //访问类变量
        System.out.println(c.radius);     //访问实例变量
        System.out.println(Circle.PI);         //访问类变量
    }
}
