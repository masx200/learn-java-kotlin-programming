package chapter.eleven.five.one;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Object> v = new Vector<>(2, 1);  //初始大小是2,增量是1
        System.out.println("矢量初始大小:" + v.size());
        System.out.println("矢量初始容量:" + v.capacity());
        v.addElement(1);
        v.addElement((2));
        v.addElement((3));
        v.addElement((4));
        System.out.println("加4 个整数元素后的容量:" + v.capacity());
        v.addElement((5.45));
        System.out.println("当前容量:" + v.capacity());
        v.addElement((6.08));
        v.addElement((7));
        System.out.println("当前容量:" + v.capacity());
        v.addElement((9.4));
        v.addElement((10));
        System.out.println("当前容量:" + v.capacity());
        v.addElement((11));
        v.addElement((12));
        System.out.println("第1 个元素:" + v.firstElement());
        System.out.println("最后一个元素:" + v.lastElement());
        if (v.contains((3))) {
            System.out.println("矢量容量:3.");
        }
        Enumeration<Object> vEnum = v.elements();  //枚举向量中的元素
        System.out.println("\n 矢量中元素:");
        while (vEnum.hasMoreElements()) {
            System.out.print(vEnum.nextElement() + " ");
        }
        System.out.println();
        System.out.println(v);
    }
}
