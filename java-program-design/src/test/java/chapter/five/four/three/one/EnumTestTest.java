package chapter.five.four.three.one;

import org.example.MockTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class EnumTestTest {

    @Test
    void maintest() {
        System.out.println(Arrays.toString(MockTest.MockTest("SMALL\n", () -> EnumTest.main(new String[]{}))));
    }

    @Test
    void maintest2() {
        System.out.println(Arrays.toString(MockTest.MockTest("EXTRA_EXTRA_LARGE\n", () -> EnumTest.main(new String[]{}))));
    }

    @Test
    void maintest3() {
        System.out.println(Arrays.toString(MockTest.MockTest("EXTRA_LARGE\n", () -> EnumTest.main(new String[]{}))));
    }

    @Test
    void maintest4() {
        System.out.println(Arrays.toString(MockTest.MockTest("LARGE\n", () -> EnumTest.main(new String[]{}))));
    }

    @Test
    void maintest5() {
        System.out.println(Arrays.toString(MockTest.MockTest("MEDIUM\n", () -> EnumTest.main(new String[]{}))));
    }
}