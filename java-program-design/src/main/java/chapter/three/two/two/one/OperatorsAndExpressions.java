package chapter.three.two.two.one;

public class OperatorsAndExpressions {
    public static void main(String[] args) {
        OperatorsAndExpressions OperAndExp = new OperatorsAndExpressions();
        //二元算术运算符的应用
        OperAndExp.doubleArithmaticOperator();
    }

    void doubleArithmaticOperator() {
        System.out.println(9 / 2);  //结果为4,因为9 和2 都是int型,结果也应该为int型
        System.out.println(5 / 2.0);
        /*  结果为2.5,因操作数2.0 为double型,结果
                                     也为double型  */
        byte x = 3, y = 4;
        long r = 80L;
        System.out.println(r / y);  //结果为20L,因为r 为long型,结果也是long型
        System.out.println(x * y); //结果为12,两个操作数都是byte 型,结果是int型
        float z = 12.5f, w = 5.5f;
        System.out.println(z + w); //结果为18.0f,两个操作数都是float型,结果是float型
        System.out.println(z - x); //结果为9.5f,z 为float型,结果为float型
    }
}