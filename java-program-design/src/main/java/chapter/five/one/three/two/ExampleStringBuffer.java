package chapter.five.one.three.two;

class ExampleStringBuffer {
    public static void main(String[] arg) {
        StringBuffer sb = new StringBuffer("test");
        System.out.println("buffer = " + sb);
        System.out.println("length = " + sb.length());
        System.out.println("capacity = " + sb.capacity());
    }
}

