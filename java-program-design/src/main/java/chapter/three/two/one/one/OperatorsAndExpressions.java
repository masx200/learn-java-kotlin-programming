package chapter.three.two.one.one;

public class OperatorsAndExpressions {
    public static void main(String[] args) {
        OperatorsAndExpressions OperAndExp = new OperatorsAndExpressions();
        //一元算术运算符的应用
        OperAndExp.singleArithmaticOperator();
    }

    void singleArithmaticOperator() {
        float i = 2.0f, j = 10.0f;
        int m = 20, n = 10;
        System.out.println((++i) * (j--));
        System.out.println("i = " + i + ",j = " + j);
        System.out.println((i++) * (j--));
        System.out.println("i = " + i + ",j = " + j);
        System.out.println((--m) * (n++));
        System.out.println("m = " + m + ",n = " + n);
        System.out.println((m--) * (n++));
        System.out.println("m = " + m + ",n = " + n);
    }
}