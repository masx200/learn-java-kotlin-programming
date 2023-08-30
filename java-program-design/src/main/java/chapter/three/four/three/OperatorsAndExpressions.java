package chapter.three.four.three;

public class OperatorsAndExpressions {
    public static void main(String[] args) {
        OperatorsAndExpressions OperAndExp = new OperatorsAndExpressions();
        //关系运算符的优先级
        OperAndExp.priorityOfRelationOperator();
    }

    void priorityOfRelationOperator() {
        int x = 10, y = 8;
        boolean b = true;
        System.out.println(x > 0 && x < y || b);
        System.out.println(x < y || !b);
        System.out.println(x == 10 && y != 8);
    }
}