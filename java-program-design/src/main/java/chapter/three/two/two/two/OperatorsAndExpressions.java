package chapter.three.two.two.two;


public class OperatorsAndExpressions{
    void residual(){
        int i = 10,j = 3;
        float m = 213.5f,n = 4.0f;
        System.out.println(i% j);
        System.out.println(m% n);
    }
    public static void main(String[] args){
        OperatorsAndExpressions OperAndExp = new OperatorsAndExpressions();
        //取模运算符在整数和浮点数中的应用
        OperAndExp.residual();
    }
}