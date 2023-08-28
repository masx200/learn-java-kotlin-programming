package Call_the_class_method_example;

import Call_the_class_method_example.Circumference.Circumference;

public class TestCircumference {
    public static void main(String[] args) {
        //对类方法的直接调用
        System.out.println("半径20的圆周长= " + Circumference.circumf(20));
    }
}