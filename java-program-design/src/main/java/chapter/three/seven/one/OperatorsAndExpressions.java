package chapter.three.seven.one;

import static chapter.five.four.one.one.Println.println;

//例3.12 条件表达式
public class OperatorsAndExpressions {
    public static void main(String[] args) {
        OperatorsAndExpressions OperAndExp = new OperatorsAndExpressions();
        //条件表达式
        String result = OperAndExp.conditionalExpression(65);
        println(result);
    }

    String conditionalExpression(int score) {
        String result;
        result = (score >= 60) ? "passed" : "doesn’t pass";
    /* 如果score 超过60 分,则结果是passed,否则是doesn’t pass
     该语句可以用if-else 来替代,但是不够简练
     if(score>= 60)result = "passed";
     else result = " doesn’t pass";  */
        System.out.println(result);
        return result;
    }
}