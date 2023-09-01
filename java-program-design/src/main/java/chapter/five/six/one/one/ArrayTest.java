package chapter.five.six.one.one;

import java.util.Arrays;

import static chapter.five.four.one.one.Println.println;

public class ArrayTest {
    public static void main(String[] args) {
        int i;
        int[] a = new int[5];         //创建数组,并对每个数组元素赋予0 初值
        for (i = 0; i < 5; i++) a[i] = i;   //对每个数组元素的下标赋值

        println(Arrays.toString(a));
        for (i = a.length - 1; i >= 0; i--)
            System.out.print("a[" + i + "]= " + a[i] + " ");  /* 按数组元素下标逆序输出 */

    }
}