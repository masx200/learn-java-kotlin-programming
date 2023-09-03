package chapter.six.one.two;

//例6.2 RunExceptin.java
public class RunExceptin {
    public static void main(String[] args) {
        try {
            int i = 8;
            int j = 8;
            int s = 40 / (i - j);

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}

