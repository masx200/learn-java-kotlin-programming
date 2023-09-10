package chapter.five.one.three.two;

class ExampleStringBuffer {
    public static void main(String[] arg) {
        StringBuffer s = new StringBuffer("test");
        System.out.println("buffer = " + s);
        System.out.println("length = " + s.length());
        System.out.println("capacity = " + s.capacity());
    }
}

