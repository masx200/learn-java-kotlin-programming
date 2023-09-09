package chapter.five.four.three.one;
//例5.9 EnumTest.java。

import java.util.Scanner;

public class EnumTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //键盘输入字符串
        //提示信息
        System.out.print("请输入服装号型:(SMALL,MEDIUM,LARGE,EXTRA_LARGE,EXTRA_EXTRA_LARGE )");
        System.out.println();
        String input = in.next().toUpperCase();  //保证大写(常量)
        /* 加载枚举类型对象,根据枚举实例名称检索枚举类型对象的实例值。Size.class 指示出返回枚举常量的那个枚举类型的Class 对象:Size.class。input 指示出返回枚举常量的名称。*/
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size = " + size);
        //调用成员方法

        System.out.println("abbreviation = " + size.getAbbreviation());
        if (size == Size.EXTRA_LARGE ^ size == Size.EXTRA_EXTRA_LARGE) {
            System.out.println("很好!你注意到了下画线\"_\"。");
        }
    }


}

