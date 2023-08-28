package Access_the_object_s_variables_and_call_methods;

public class Accessobj {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);   //生成对象并初始化
        p1.move(5, 5);                //调用成员方法move
        System.out.println("x =" + p1.x + "y =" + p1.y);   //访问成员变量
    }
}
