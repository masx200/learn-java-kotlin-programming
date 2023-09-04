package chapter.two.two.five.one;

public class AutTypeTransition {
    public static void main(String[] args) {
        char a = 'h';
        byte b = 6;
        int i = 100;
        long l = 567L;
        float f = 8.99f;
        double d = 4.7788;
        int aa = a + i;          //a 自动转换为int 类型后再运算
        long ll = l - aa;        //aa 自动转换为long 类型后再运算
        float ff = b * f;        //b 自动转换为float 类型后再运算
        double dd = ff / aa + d;
        /* aa 自动转换为float 类型后运算ff/aa得float结果后
                              再自动转换为double 类型再运算 */
        System.out.println("aa =" + aa);
        System.out.println("ll =" + ll);
        System.out.println("ff =" + ff);
        System.out.println("dd =" + dd);
    }
}
