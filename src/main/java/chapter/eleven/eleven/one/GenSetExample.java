package chapter.eleven.eleven.one;

import java.util.HashSet;
import java.util.Set;

public class GenSetExample {
    public static void main(String[] args) {
        //Set<String>类的变量set 赋予新的HashSet<String>对象
        Set<String> set = new HashSet<>();
        //添加一些String 对象
        set.add("one");
        set.add("seconD");
        set.add("3rD");
        System.out.println(set);
    }
}
