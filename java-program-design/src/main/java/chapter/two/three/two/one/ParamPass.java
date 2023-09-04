package chapter.two.three.two.one;

import static chapter.five.four.one.one.Println.println;

public class ParamPass {
    static void paramChange(int x, Object1 obj1) {
        x = 18;
        obj1.QQ = "小狗";
    }

    public static void main(String[] args) {
        int x = 28;
        Object1 obj1 = new Object1();
        println(obj1);    //创建对象obj1
        System.out.println("传递前的参数值:x = " + x + " QQ = " + obj1.QQ);
        ParamPass.paramChange(x, obj1);            //传递变量和对象引用
        System.out.println("传递后的参数值:x =" + x + " QQ =" + obj1.QQ);
        println(obj1);

    }

}
