package chapter.one.two.three.two;

public class Point {                //定义类Point
    public int x;
    public int y;                  //定义成员变量

    Point() {
        //定义无参数构造方法
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        //定义带参数构造方法
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void move(int x1, int y1) {   //定义move 方法
        x = x1;
        y = y1;
    }
}
