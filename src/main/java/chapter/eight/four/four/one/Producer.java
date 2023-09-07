package chapter.eight.four.four.one;

public class Producer implements Runnable {
    private static int counter = 1;
    private final SyncStack theStack;
    private final int num;

    public Producer(SyncStack s) {
        theStack = s;
        num = counter++;
    }

    //run()方法是生产者线程的线程体,每次随机产生一个字母放入堆栈,
    //然后休眠300 毫秒,共进行200 次
    public void run() {
        char c;
        for (int i = 0; i < 200; i++) {
            c = (char) (Math.random() * 26 + 'A');
            theStack.push(c);
            System.out.println("Producer" + num + ":" + c);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
            }
        }
    }
}
