package chapter.six.three.two.one;

public class UseFinally {
    static final Switch sw = new Switch();

    public static void main(String[] args) {
        try {
            sw.on();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (IllegalArgumentException e) {
            System.out.println("IOException");
        } finally {
            sw.off();
        }
    }
}

