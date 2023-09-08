package chapter.eleven.eight.one;

import java.util.Hashtable;
import java.util.Set;

public class Hashtable2 {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<>();
        String str;
        double bal;
        balance.put("王向东", (3434.34));
        balance.put("李闵", (123.22));
        balance.put("赛书生", (1378.00));
        //显示hash 表中所有余额.
        Set<String> set = balance.keySet(); //获得关键字的集合视图
        //获得迭代子
        for (String o : set) {
            str = o;
            System.out.println(str + " :" + balance.get(str));
        }
        //在李闵账户存入1,000 元
        bal = balance.get("李闵");
        balance.put("李闵", (bal + 1000));
        System.out.println("李闵的新余额:" + balance.get("李闵"));
    }
}
