package chapter.three.five.three.one;

public class OperatorsAndExpressions {
    public static void main(String[] args) {
        OperatorsAndExpressions OperAndExp = new OperatorsAndExpressions();
        //位运算符的优先级
        OperAndExp.priorityOfBitOperator();
    }

    void priorityOfBitOperator() {
        int a = -67, b = 116, c = 78;     //a = 10111101,b = 01110100,c = 01001110
        int d = ~a | b & c;  //相当于(~a)| (b&c)
        int e = ~c >> 2 & (a | ~b);  //相当于(~c>>2)&(a|~b)
        int f = a ^ b & c;  //相当于a^(b&c)
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
    }
}