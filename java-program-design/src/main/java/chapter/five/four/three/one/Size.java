package chapter.five.four.three.one;

/*枚举类型的类定义没有使用class 关键字,而是使用enum 关键字,且没有在枚举类名之后标明extends Enum。(java.lang.Enum<E>)在枚举类型类Size 中,枚举了5 个实例。这些实例都是static final 的常量。枚举类型类java.lang.Enum<E>没有用new 关键字生成实例,而是在大括弧中,枚举出实例。*/
enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL"),
    EXTRA_EXTRA_LARGE("XXL");

    //声明自己的变量
    private final String abbreviation;
    /* 枚举类型也可以有自己的构造方法:private Size(String abbreviation)
  this 在此表示在构造方法内引用调用该构造方法的对象size 的实例变量:
        private String abbreviation  */

    Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    //枚举类型也可以有自己的成员方法
    public String getAbbreviation() {
        return abbreviation;
    }
}
