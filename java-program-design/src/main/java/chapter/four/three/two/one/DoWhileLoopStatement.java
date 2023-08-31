package chapter.four.three.two.one;

//例4.6 随机产生若干字母(A ~ Z),一直到出现字母Z。
//        import java.math.*;
public class DoWhileLoopStatement {
    public static void main(String[] args) {
        char c;
        do {
            c = (char) ('A' + (int) (Math.random() * 26));
            System.out.print(c + ",");
        } while (c != 'Z');
    }
}
