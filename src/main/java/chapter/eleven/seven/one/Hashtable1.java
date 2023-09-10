package chapter.eleven.seven.one;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hashtable1 {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<>();
        Enumeration<String> names;
        String str;
        double bal;
        balance.put("王向东", (3434.34));
        balance.put("李闵", (123.22));
        balance.put("赛书生", (1378.00));
        names = balance.keys();  //显示hash 表中所有余额
        while (names.hasMoreElements()) {
            str = names.nextElement();
            System.out.println(str + " :" + balance.get(str));
        }
        //在李闵账户存入1,000 元
        bal = balance.get("李闵");
        balance.put("李闵", (bal + 1000));
        System.out.println("李闵的新余额:" + balance.get("李闵"));

        System.out.println(balance);
    }
}
