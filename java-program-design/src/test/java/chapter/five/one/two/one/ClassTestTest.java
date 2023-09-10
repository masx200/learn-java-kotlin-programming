package chapter.five.one.two.one;

import org.example.MockTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ClassTestTest {

    @Test
    void maintest() {
        System.out.println(Arrays.toString(MockTest.MockTest("java.util.Date\n", () -> ClassTest.main(new String[]{}))));
    }
}