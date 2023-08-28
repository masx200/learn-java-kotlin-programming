package Objects_are_used_as_class_members;

public class Date {             //定义了日期Date 类,有年、月、日的特性
    int year, month, day;   //成员变量

    Date(int y, int m, int d) {       //构造方法
        year = y;
        month = m;
        day = d;
    }

    void showDate() {               //显示日期方法
        System.out.println(year + "," + month + "," + day);
    }
}
