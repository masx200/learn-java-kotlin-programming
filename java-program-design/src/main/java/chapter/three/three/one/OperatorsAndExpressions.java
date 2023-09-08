package chapter.three.three.one;

public class OperatorsAndExpressions {
    public static void main(String[] args) {
        OperatorsAndExpressions OperAndExp = new OperatorsAndExpressions();
        //用于基本类型数据和复合类型数据的"== "运算符
        OperAndExp.equalsMethod1();
    }

    void equalsMethod1() {
        int i = 10, j = 15;
        System.out.println(i == j);         //基本类型的数据之间的比较
        String s1 = "how are you";
        String s2 = "how are you";
        System.out.println(s1 == s2);       //复合数据类型的数据之间的比较
    }
}