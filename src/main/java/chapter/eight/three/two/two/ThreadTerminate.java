package chapter.eight.three.two.two;

public class ThreadTerminate {
    public static void main(String[] args) throws Exception {
        int i = 0;
        Hello h = new Hello();
        Thread t = new Thread(h);
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
        System.out.println("Please stop saying Hello and say good morning!");
        h.stopRunning();  //设置线程t 的终止标志
        while (i < 5) {
            System.out.println("Good Morning" + i++);
        }
    }
}


