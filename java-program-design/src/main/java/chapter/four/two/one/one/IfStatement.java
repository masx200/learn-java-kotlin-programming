package chapter.four.two.one.one;
//例4.1 产生一个0 ~ 100 之间的随机数,并显示出来;如果该随机数大于60,则显示"Pass
//        the examination"等语句。
//Math 类在java.lang 包中,它包括许多数学计算方法,包括产生随机数的方法

public class IfStatement {
    public static void main(String[] args) {
        /*  random()返回值是一个伪随机数,该数是带正号的double 值,在[0.0,1.0]的范围内正态分布   */
        int x = (int) (Math.random() * 100);
        System.out.println("The score is:" + x);
        if (x >= 60) {
            System.out.println("Pass the examination!");
            System.out.println("Congratulations!");
            System.out.println("Have a good day!");
        }
        System.out.println("Bye Bye!");
    }
}


