package chapter.one.two.three.four;

//显示教师生日的应用程序
public class Teacher1 {      //Teacher1 教师生日类定义
    String name;
    Date birth;               //对象变量作为类成员

    public static void main(String[] args) {
        Teacher1 teacher = new Teacher1();    //创建teacher 实例
        //调用setTeacher 方法初始化teacher
        teacher.setTeacher("张闻", 1968, 6, 18);
        //调用showTeacher方法显示teacher变量
        teacher.showTeacher();
    }

    //初始化方法
    void setTeacher(String t1, int y, int m, int d) {
        name = t1;
        birth = new Date(y, m, d);   //在setTeacher方法中创建Date 对象赋给对象变量
    }

    void showTeacher() {
        System.out.println("名字:" + name);
        System.out.print("生日:");
        birth.showDate();         //在showTeacher方法中调用birth的showDate()方法
    }
}