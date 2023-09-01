package chapter.five.six.two.two;

import java.util.Arrays;

import static chapter.five.four.one.one.Println.println;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] smallPrimes = {2, 3, 5, 7, 11, 13};
        int[] luckyNumbers = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
        println(Arrays.toString(smallPrimes));
        println(Arrays.toString(luckyNumbers));

        System.arraycopy(smallPrimes, 2, luckyNumbers, 3, 4);
        println(Arrays.toString(smallPrimes));
        println(Arrays.toString(luckyNumbers));
        for (int i = 0; i < luckyNumbers.length; i++)
            System.out.println(i + " entry after copy is " + luckyNumbers[i]);
    }
}