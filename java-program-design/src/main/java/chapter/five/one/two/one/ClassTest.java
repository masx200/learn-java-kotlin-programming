package chapter.five.one.two.one;

import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ClassTest {
    public static void main(String[] args) {
        String name;
        System.out.println("根据类名获取类修饰符及其直接父类名:");
        Scanner in = new Scanner(System.in);
        System.out.println("请输入含有包路径的类名(如java.util.Date):");
        name = in.next();
        try {
            Class<?> cl = Class.forName(name);
            Class<?> supercl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if (!modifiers.isEmpty())
                System.out.println(name + " 的修饰符是:" + modifiers + " ");
            System.out.print(name);
            if (supercl != null) System.out.print("的直接父类是:" + supercl.getName());
            System.out.print("\n \n");
        } catch (ClassNotFoundException e) {
            System.out.print("对不起,该类不在Java 类库。\n \n");
        }
        System.exit(0);
    }
}
