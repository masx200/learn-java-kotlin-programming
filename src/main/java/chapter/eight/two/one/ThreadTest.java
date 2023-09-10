package chapter.eight.two.one;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Hello());
        Thread t2 = new Thread(new Hello());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}