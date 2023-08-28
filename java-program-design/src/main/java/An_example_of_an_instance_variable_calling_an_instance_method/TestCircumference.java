package An_example_of_an_instance_variable_calling_an_instance_method;

public class TestCircumference {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 20;
        double circumf1 = c1.circumference();     //实例变量调用实例方法
        System.out.println("圆的周长= " + circumf1);
    }
}