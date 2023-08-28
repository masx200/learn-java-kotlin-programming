package An_example_of_an_instance_variable_calling_an_instance_method;

public class Circle {
    static final double PI = 3.14159265;
    public int radius = 0;

    public double circumference() {     //实例方法
        return (2 * PI * radius);
    }
}