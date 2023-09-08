package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MainTest {

    @Test
    void mainTest() {
        var result = MockTest.MockTest("3 9 20 null null 15 7 !\n", () -> Main.main(new String[]{}));
        System.out.println(Arrays.toString(result));
    }

}
