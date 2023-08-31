package chapter.five.one.one.one;

public class TestCar {
    public static void main(String[] args) {
        Car x = new Car("红旗AJ", false);
        Car y = new Car("QQ-WQ", true);
        System.out.println(x + "等同于" + y + "是:" + x.equals(y));
        System.out.println("x 与y 是同样的对吗?" + (x == y));
        System.out.println(y + "等同于" + y + "是:" + y.equals(y));
        System.out.println("y 与z 是同样的对吗?" + (y == y));
    }
}
