package chapter.one.two.three.two;

public class Accessobj {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);   //生成对象并初始化
        System.out.println("x =" + p1.x + " y =" + p1.y);   //访问成员变量
        p1.move(5, 5);                //调用成员方法move
        System.out.println("x =" + p1.x + " y =" + p1.y);   //访问成员变量
    }
}
