package chapter.three.four.two;

public class OperatorsAndExpressions {
    public static void main(String[] args) {
        OperatorsAndExpressions OperAndExp = new OperatorsAndExpressions();
        //短路逻辑表达式的应用
        OperAndExp.shortCircuit2(0);
    }

    void shortCircuit2(int val) {
        if ((val != 0) && ((double) 1 / val < Double.MAX_VALUE)) {
            System.out.println("val 的倒数为:" + 1 / val);
        } else {
            System.out.println("val 的倒数为无穷大");
        }
    }
}
