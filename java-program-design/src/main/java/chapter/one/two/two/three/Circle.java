package chapter.one.two.two.three;

public class Circle {
    static final double PI = 3.14159265;
    public int radius = 0;

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public double circumference() {     //实例方法
        return (2 * PI * radius);
    }
}
