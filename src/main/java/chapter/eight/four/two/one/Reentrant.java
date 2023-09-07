package chapter.eight.four.two.one;

public class Reentrant {
    public static void main(String[] args) {
        Reentrant r = new Reentrant();
        r.a();
    }

    public synchronized void a() {
        b();
        System.out.println("here I am,in a()");
    }

    public synchronized void b() {
        System.out.println("here I am,in b()");
    }
}
