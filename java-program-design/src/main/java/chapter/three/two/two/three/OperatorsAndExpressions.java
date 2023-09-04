package chapter.three.two.two.three;


//例3.4 "+"运算符在字符串中的应用
public class OperatorsAndExpressions {
    public static void main(String[] args) {
        OperatorsAndExpressions OperAndExp = new OperatorsAndExpressions();
        //+ 运算符在字符串中的应用
        OperAndExp.stringPlus();
    }

    void stringPlus() {
        int x = 3, y = 4, z = 5;
        String s = " xyz = ";
        System.out.println(x + y + z);
        System.out.println(s + x + y + z);
        System.out.println(x + y + z + s);
        System.out.println("abc" + 3);
        System.out.println(3.0 + "abc");
    }
}