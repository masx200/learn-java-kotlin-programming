package object_as_a_method_parameter;
public
class Date {               //定义了日期类,有年,月,日的特性
    final int year;
    final int month;
    final int day;

    //构造方法
    Date(int y, int m, int d) {
        year = y;
        month = m;
        day = d;
    }

    void showDate() {         //显示日期方法
        System.out.println(year + "," + month + "," + day);
    }
}
