package chapter.five.four.four.one;

abstract class Person {               //抽象类声明
    private final String name;

    public Person(String n) {
        name = n;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public abstract String getDescription();  //没有方法体的抽象方法

    public String getName() {
        return name;
    }
}
