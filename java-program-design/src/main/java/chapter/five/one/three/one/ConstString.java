package chapter.five.one.three.one;

//例5.3 ConstString.java
public class ConstString {
    public static void main(String[] args) {
        char[] chars1 = {'t', 'e', 's', 't'};
        char[] chars2 = {'t', 'e', 's', 't', '1'};
        String s1 = new String(chars1);
        String s2 = new String(chars2, 0, 4);
        System.out.println("Value of String s1 is:" + s1);
        System.out.println("Value of String s2 is:" + s2);
        System.out.println("它们都是字符串\"test\"!");
    }
}

