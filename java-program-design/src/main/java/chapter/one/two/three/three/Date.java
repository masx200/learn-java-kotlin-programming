package chapter.one.two.three.three;

public class Date {             //定义了日期Date 类,有年、月、日的特性
    final int year;
    final int month;
    final int day;   //成员变量

    public Date(int y, int m, int d) {       //构造方法
        year = y;
        month = m;
        day = d;
    }

    public void showDate() {               //显示日期方法
        System.out.println(year + "," + month + "," + day);
    }
}
