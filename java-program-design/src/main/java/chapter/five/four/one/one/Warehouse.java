package chapter.five.four.one.one;

public class Warehouse {
    public static void main(String[] args) {
        Light.writeCount();                  //用类名调用
        Light aLight = new Light();         //创建一个对象
        System.out.println("Value of counter:" + Light.counter); //通过类名访问
        Light bLight = new Light();      //创建另一个对象
        Light.writeCount();             //利用引用调用
        Light cLight = new Light();      //再创建一个对象
        System.out.println("Value of counter:" + Light.counter); //通过引用访问
        Println.println(aLight);
        Println.println(bLight);
        Println.println(cLight);
    }

}
