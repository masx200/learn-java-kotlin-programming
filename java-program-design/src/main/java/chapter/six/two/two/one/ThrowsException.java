package chapter.six.two.two.one;

public class ThrowsException {
    static void Example(int keg) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        System.out.println("---In KegDepartment " + keg + "---");
        if (keg == 10) {
            System.out.println("no Exception caught");
        } else if (keg == 20) {
            int[] iArray = new int[4];
            iArray[10] = 3;
        }
    }

    public static void main(String[] args) {
        try {
            Example(10);
            Example(20);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch " + e);
        } finally {
            System.out.println("in Example finally");
        }
    }
}
