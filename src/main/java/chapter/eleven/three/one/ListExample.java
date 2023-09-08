package chapter.eleven.three.one;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Object> l = new ArrayList<>();
        l.add("欢迎您");
        l.add("学习");
        l.add("Java");
        l.add((2008));
        l.add("谢谢!");
        l.add((2008));
        System.out.println(l);
    }
}
