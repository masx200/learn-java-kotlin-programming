package chapter.six.two.three.one;

public class ThrowableException {
    public static void main(String[] args) {
        try {
            throw new Throwable("Here is my Exception");
        } catch (Throwable e) {
            System.out.println("Caught Throwable");
            System.out.println("e.getMessage():" + e.getMessage());
            System.out.println("e.toString():" + e);
            System.out.println("e.printStackTrace():");
            e.printStackTrace();
        }
    }
}
