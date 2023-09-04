package chapter.one.two.two.one;

public class Date {
    private int day = 0;
    private int month = 0;
    private int year = 0;

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    //成员方法
    public void setDate(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    public void showDate() {
        System.out.println(day + ":" + month + ":" + year);
    }
}
