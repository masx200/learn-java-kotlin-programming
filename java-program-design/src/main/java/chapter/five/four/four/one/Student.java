package chapter.five.four.four.one;

class Student extends Person {  //继承抽象类的子类
    private final String major;

    public Student(String n, String m) {
        super(n);
        major = m;
    }

    @Override
    public String toString() {
        return "Student{" +
                "major='" + major + '\'' +
                "} " + super.toString();
    }

    public String getDescription() {  //实现抽象方法
        return " 大学生,专业是" + major + "。";
    }
}

