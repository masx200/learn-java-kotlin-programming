package chapter.five.four.one.one;

class Light {
    //static 变量
    static int counter; //创建灯管对象编号No.
    int wattage;      //瓦特数
    boolean indicator; //开关
    String location;  //位置

    Light() {  //默认构造方法
        wattage = 50;
        indicator = true;
        location = "X";
        ++counter;    //计数器增量
    }

    //static 方法
    public static void writeCount() {
        System.out.println("Number of lights:" + counter);
        //瓦数不可赋值的编译错:输出瓦数
        //System.out.println("Number of Watts:"+ wattage);
    }

    @Override
    public String toString() {
        return "Light{" +
                "wattage=" + wattage +
                ", indicator=" + indicator +
                ", location='" + location + '\'' +
                '}';
    }
}
