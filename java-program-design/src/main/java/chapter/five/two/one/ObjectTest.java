package chapter.five.two.one;

public class ObjectTest {
    public static void main(String[] args) {
        Employee zhang1 = new Employee("张浩", 75000, 1987, 12, 15);
        Employee zhang3 = new Employee("张浩", 75000, 1987, 12, 15);
        Employee bob = new Employee("Bob Brandson", 50000, 1989, 10, 1);
        System.out.println("zhang1 == zhang2:" + (zhang1 == zhang1));
        //非赋值操作,使用"== "测试,结果为false
        System.out.println("zhang1 == zhang3:" + (zhang1 == zhang3));
        //使用equals()测试,结果为true
        System.out.println("zhang1.equals(zhang3):" + zhang1.equals(zhang3));
        //显示:false
        System.out.println("zhang1.equals(bob):" + zhang1.equals(bob));
        System.out.println("bob.toString():" + bob);   //覆盖Object 的toString()
        Manager carl = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);    //设置经理津贴
        //覆盖Employee 的toString()
        System.out.println("boss.toString():" + boss);
        System.out.println("carl.equals(boss):" + carl.equals(boss));   //覆盖
        System.out.println("zhang1.hashCode():" + zhang1.hashCode());   //覆盖
        System.out.println("zhang3.hashCode():" + zhang3.hashCode());   //覆盖
        System.out.println("bob.hashCode():" + bob.hashCode());   //方法覆盖
        System.out.println("carl.hashCode():" + carl.hashCode()); //方法覆盖
        System.out.println("boss.hashCode():" + boss.hashCode()); //方法覆盖
        System.out.println(zhang1);
        System.out.println(zhang3);
        System.out.println(bob);
        System.out.println(carl);
        System.out.println(boss);
    }
}

