package chapter.eleven.one.one;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        Collection<Integer> intList = new ArrayList<>();        //创建一个列表数组
        int[] values = {9, 11, -4, 1, 13, 99, 1, 0};        //包装成整数对象
        //将当前整数值对象加入列表数组
        for (int j : values) {
            intList.add((j));
        }
        System.out.println("迭代之前:" + intList);   //显示迭代之前的列表
        Iterator<Integer> interator = intList.iterator();      //定义迭代操作
        while (interator.hasNext()) {                   //循环实现迭代
            int value = interator.next();              //将对象转换成整数
            if (value < 1 || value > 10) {
                interator.remove();  /*如值不在1 和10 之间,删除该元素*/
            }
        }
        System.out.println("迭代之后:" + intList);   //显示迭代之后的列表
    }
}