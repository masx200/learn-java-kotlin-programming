package chapter.eight.four.four.one;

//(2)Consumer.java
public class Consumer extends Thread {
    private static int counter = 1;
    private final SyncStack theStack;
    private final int num;

    public Consumer(SyncStack s) {
        theStack = s;
        num = counter++;
    }

    //run()方法是消费者线程的线程体,每次执行弹栈操作,并将得到的数据输出,
    //然后休眠300 毫秒,共进行200 次
    public void run() {
        char c;
        for (int I = 0; I < 20; I++) {
            c = theStack.pop();
            System.out.println("Consumer" + num + ":" + c);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
            }
        }
    }
}
