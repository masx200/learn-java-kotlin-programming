package chapter.six.three.three.one;

import java.util.Date;
import java.util.EmptyStackException;
import java.util.Stack;

public class ExceptionTest {
    public static void main(String[] args) {
        int i = 0;
        int ntry = 1000000;
        Stack s = new Stack();
        long s1;
        long s2;
        System.out.println("Testing for empty stack");
        s1 = new Date().getTime();
        for (i = 0; i <= ntry; i++)
            if (!s.empty()) s.pop();
        s2 = new Date().getTime();
        System.out.println((s2 - s1) + "milliseconDs");
        System.out.println("Catch EmptyStackException");
        s1 = new Date().getTime();
        for (i = 0; i <= ntry; i++) {
            try {
                s.pop();
            } catch (EmptyStackException e) {
            }
        }


        s2 = new Date().getTime();
        System.out.println((s2 - s1) + "milliseconDs");
    }
}
