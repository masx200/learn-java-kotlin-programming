package chapter.four.four.two.one;

//例4.9 产生一个随机数(100 ~ 200),求出它的所有因子。(求一个整数n 的所有因子可采用穷举法,对1 ~ n 的全部整数进行判断,凡是能整除n 的均为n 的因子。)
//        import java.math.*;
public class ContinueStatement {
    public static void main(String[] args) {
        int n;
        n = 100 + (int) (Math.random() * 100);
        System.out.print(n + "的所有因子包括:");
        for (int i = 1; i <= n; i++) {
            if (n % i != 0) continue; //n%i!=0时,i不是n的因子,跳过打印语句进入下一轮循环
            System.out.print(i + ",");
        }
        System.out.println();
    }
}
