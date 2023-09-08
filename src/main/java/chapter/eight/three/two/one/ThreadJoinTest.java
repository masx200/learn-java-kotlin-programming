package chapter.eight.three.two.one;

public class ThreadJoinTest {
    public static void main(String[] args) throws Exception {
        int i = 0;
        Hello t = new Hello();
        t.start();
        do {
            System.out.println("Good Morning" + i++);
            if (i == 2 && t.isAlive()) {
                System.out.println("Main waiting for Hello!");
                t.join();   //等待t 运行结束
            }
        } while (i != 5);
    }
}
