package chapter.eight.three.two.one;

public class Hello extends Thread {
    int i;

    public void run() {
        while (true) {
            System.out.println("Hello" + i++);
            if (i == 5) break;
        }
    }
}
