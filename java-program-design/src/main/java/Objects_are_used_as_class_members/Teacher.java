package Objects_are_used_as_class_members;

//显示教师生日的应用程序
public class Teacher {
    private String name;       //类成员定义为private 是保证数据安全
    private Date birth;        //实例变量做类成员,默认值为null

    public static void main(String[] args) {
        Teacher teacher = new Teacher();           //创建teacher 实例
        teacher.setTeacher("刘小灵", 1970, 8, 18);  //调用setTeacher()方法初始化
        System.out.println("name = " + teacher.name);
        System.out.print("刘小灵生日= ");
        teacher.getBirth().showDate(); /*调用getBirth 方法返回birth 对象,再调用该对象showDate()方法显示生日*/
    }

    //初始化Teacher 方法
    void setTeacher(String t1, int y, int m, int d) {
        name = t1;
        birth = new Date(y, m, d);
    }

    Date getBirth() {           //定义getbirth()方法,方法作为返回birth 变量值
        return birth;
    }
}

