package chapter.two.three.three.one;

public class BirthDate {
    private int day = 1;

    private int month = 1;
    private int year = 1900;

    public BirthDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public BirthDate(BirthDate date) {
        this.day = date.day;
        this.month = date.month;
        this.year = date.year;
    }

    public BirthDate addDays(int add_days) {
        var otherDate = new BirthDate(this);
        otherDate.day = otherDate.day + add_days;
        return otherDate;

    }
}
