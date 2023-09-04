package chapter.two.three.three.two;

class UniversityStudent extends Student {     //Student 的子类
    final String university;

    UniversityStudent(String name, String department, String university) {
        super(name, department);                  //直接调用父类的构造方法
        this.university = university;            //获取父类变量
    }
}
