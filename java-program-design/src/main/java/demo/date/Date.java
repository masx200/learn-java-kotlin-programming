package demo.date;

public class Date {
    private int day;
    private int month;
    private int year;

    //成员方法
    public void setDate(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    public void showDate() {
        System.out.println("day-" + day + ":" + "month-" + month + ":" + "year-" + year);
    }
}
