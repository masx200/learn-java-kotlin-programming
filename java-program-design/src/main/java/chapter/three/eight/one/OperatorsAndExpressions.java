package chapter.three.eight.one;

//例3.13 复杂表达式和运算符的优先级
public class OperatorsAndExpressions {
    public static void main(String[] args) {
        OperatorsAndExpressions OperAndExp = new OperatorsAndExpressions();
        //复杂表达式和运算符的优先级
        OperAndExp.complicatedExpression(20, 30);
    }

    void complicatedExpression(int x, int y) {
        boolean b;
        b = x > 50 && y > 60 || x > 50 && y < -60 || x < -50 && y > 60 || x < -50 && y < -60;
        /* 该表达式相当于((x>50)&&(y>60))|| ((x>50)&&(y<-60))|| ((x<-50)&&(y>60))|| ((x<-50)&&(y<-60))    */
        System.out.println(b);
    }
}