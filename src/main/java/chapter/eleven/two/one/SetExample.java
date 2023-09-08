package chapter.eleven.two.one;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        //对Set 所有原有字符创建一个encountered 集合,对它保持跟踪
        Set<Character> encountered = new HashSet<>();
        //对运行程序的java 命令后参数的字符串中每个字符转换为集合元素
        for (String argument : args) {
            //把当前字符转换为字符集合对象
            Set<Character> characters = new HashSet<>();
            int size = argument.length();
            //把字符对象加到字符集合中
            for (int j = 0; j < size; j++) {
                characters.add((argument.charAt(j)));
            }
            //确定是否有公共子集存在(1)
            Set<Character> commonSubset = new HashSet<>(encountered);
            commonSubset.retainAll(characters);
            boolean areDisjunct = commonSubset.isEmpty();
            if (areDisjunct) {
                System.out.println(characters + " 和" + encountered + " 是分离的.");
            } else {
                //确定父集与子集的关系(2)
                boolean isSubset = encountered.containsAll(characters);
                boolean isSuperset = characters.containsAll(encountered);
                if (isSubset && isSuperset) {
                    System.out.println(characters + " 是相同于" + encountered);
                } else if (isSubset) {
                    System.out.println(characters + " 的父集是" + encountered);
                } else if (isSuperset) {
                    System.out.println(characters + " 的子集是" + encountered);
                } else {
                    System.out.println(characters + "和" + encountered + "的公共子集是" + commonSubset);
                }
            }
            encountered.addAll(characters); //最终的字符集
        }
        System.out.println(encountered);
    }
}
