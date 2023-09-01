package chapter.three.two.three.one;

public class OperatorsAndExpressions {
    public static void main(String[] args) {
        OperatorsAndExpressions OperAndExp = new OperatorsAndExpressions();
        //算术运算符的优先级
        OperAndExp.priorityOfArithmaticOperator();
    }

    void priorityOfArithmaticOperator() {
        int a = 10, b = 4, c = 20, d = 6;
        System.out.println(a + b * c + d);
        System.out.println(a + c % b);
        System.out.println(a++ * b + c * --d);
    }
}