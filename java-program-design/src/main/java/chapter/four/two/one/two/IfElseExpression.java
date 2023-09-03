package chapter.four.two.one.two;

//例4.2 随机产生一个年份(1 ~ 2000),判断是否为闰年。
//        分析:闰年的年份可被4 整除而不能被100 整除,或者能被400 整除。因此,首先产生的年
//        份存放到变量year 中,如果表达式
//        year % 4 == 0 && year % 100 != 0 || year % 400 == 0
//        的值为true,则为闰年;否则就不是闰年。
//
//        import java.math.*;
public class IfElseExpression {
    public static void main(String[] args) {
        int year = (int) (Math.random() * 2000) + 1;
        //下面用if-else 结构判断year 中的年份是否为闰年
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "年是闰年");
        } else {
            System.out.println(year + "年不是闰年");
        }
    }
}

