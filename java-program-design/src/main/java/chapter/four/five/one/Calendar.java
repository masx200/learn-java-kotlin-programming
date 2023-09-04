package chapter.four.five.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calendar {
    static int year;     //打印哪一年的日历
    static int weekday;  //该年的第一天是星期几

    //由于要求用户输入,考虑可能有I /O 异常,需抛出异常,具体参见第7 章
    public static void main(String[] args) throws IOException {
        //下列代码用于从键盘接收用户输入的年份
        System.out.println("请输入年份:");
        InputStreamReader ir;
        BufferedReader in;
        ir = new InputStreamReader(System.in);
        in = new BufferedReader(ir);
        String s = in.readLine();      //读取文本的一行
        year = Integer.parseInt(s);
        if (year < 1) {
            System.out.println("输入的年份不能小于1 !");
            return;
        }
        weekday = (int) firstDayOfYear(year);  //计算该年第一天是星期几
        System.out.println(year + "年");
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =");
        for (int i = 1; i <= 12; i++) {
            System.out.println();
            printMonth(i);
            System.out.println();
        }
    }

    /***打印每月日期*/
    public static void printMonth(int m) {
        printHead(m);
        int days = daysOfMonth(m);
        for (int i = 1; i <= days; i++) {
            if (i < 10) {
                System.out.print(" " + i);
            } else {
                System.out.print("  " + i);
            }
            weekday = (weekday + 1) % 7;
            if (weekday == 0) {
                System.out.println();
                System.out.print("  ");
            }
        }
    }

    /***打印每周星期标题*/
    public static void printHead(int m) {
        System.out.println(" " + m + "月  日 一 二 三 四 五 六");
        System.out.print("  ");
        for (int i = 0; i < weekday; i++) {
            System.out.print(" ");
        }
    }

    /***计算每年第一天是星期几 */
    public static long firstDayOfYear(int y) {
        long n;
        n = y * 365L;
        for (int i = 1; i < y; i++) {
            if (isLeapYear(i)) {
                n += 1;
            }
        }
        return n % 7;
    }

    /***返回每月的天数 */
    public static int daysOfMonth(int m) {
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
        }
        return 0;
    }

    /***判断是不是闰年 */
    public static boolean isLeapYear(int y) {
        return ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0);
    }
}


