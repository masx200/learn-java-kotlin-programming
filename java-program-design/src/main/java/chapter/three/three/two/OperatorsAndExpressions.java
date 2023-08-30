package chapter.three.three.two;

public class OperatorsAndExpressions{
    void equalsMethod2(){
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        MyValue v1 = new MyValue();
        MyValue v2 = new MyValue();
        v1.i = v2.i = 2003;
        System.out.println(v1.equals(v2));
    }
    public static void main(String[] args){
        OperatorsAndExpressions OperAndExp = new OperatorsAndExpressions();
        //用于对象比较的相等运算符
        OperAndExp.equalsMethod2();
    }
}