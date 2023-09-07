package chapter.eight.four.four.one;

import java.util.Vector;

public class SyncStack {
    private final Vector<Character> buffer = new Vector<>(400, 200);

    //为了保证共享数据一致性,push()方法声明为synchronized
    public synchronized char pop() {
        char c;
        //如果在堆栈为空,则执行该方法的线程必须等待,直到堆栈中有数据
        while (buffer.isEmpty()) {
            try {
                this.wait();
            } catch (InterruptedException e) {
            }
        }
        c = buffer.remove(buffer.size() - 1);//进行弹栈操作
        return c;
    }

    public synchronized void push(char c) {
        this.notify();   //通知等待的线程
        Character charObj = c;
        buffer.addElement(charObj);
    }
}
