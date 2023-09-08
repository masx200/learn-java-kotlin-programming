package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

class MainTest {

    synchronized private static String[] MockTest(String input, Runnable runnable) {
        PrintStream orig = System.out;

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        System.setOut(new PrintStream(os, false, StandardCharsets.UTF_8));
        PrintStream orige = System.err;

        ByteArrayOutputStream ose = new ByteArrayOutputStream();
        System.setErr(new PrintStream(ose, false, StandardCharsets.UTF_8));

        InputStream is = System.in;
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        try {
            runnable.run();
        } finally {
            System.setOut(orig);
            System.setErr(orige);
            System.setIn(is);

        }
        return new String[]{(os.toString(StandardCharsets.UTF_8)), (ose.toString(StandardCharsets.UTF_8))};

    }

    @Test
    void mainTest() {
        var result = MockTest("3 9 20 null null 15 7 !\n", () -> Main.main(new String[]{}));
        System.out.println(Arrays.toString(result));
    }

}
