package chapter.two.three.three.two;

public class TestUniversityStudent {
    public static void main(String[] args) {
        UniversityStudent us = new UniversityStudent("张三", "计算机系", "清华大学");
        System.out.println("名字:" + us.name + " 系:" + us.department + " 大学:" + us.university);
        System.out.println(us);
    }
}