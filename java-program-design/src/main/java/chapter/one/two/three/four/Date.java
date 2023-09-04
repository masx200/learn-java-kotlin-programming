package chapter.one.two.three.four;

public class Date {               //定义了日期类,有年,月,日的特性
    final int year;
    final int month;
    final int day;

    //构造方法
    public Date(int y, int m, int d) {
        year = y;
        month = m;
        day = d;
    }

    public void showDate() {         //显示日期方法
        System.out.println(year + "," + month + "," + day);
    }
}
