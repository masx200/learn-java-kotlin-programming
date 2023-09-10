package chapter.seven.nine.two.one;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

class HrefMatchTest {

    @Test
    void maintest() {

        System.out.println(Arrays.toString(  MockTest.MockTest("https://www.eduexam.cn/\n", () -> HrefMatch.main(new String[]{}))));
    }
}

