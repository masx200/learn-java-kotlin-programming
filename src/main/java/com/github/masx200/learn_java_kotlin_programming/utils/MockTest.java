package com.github.masx200.learn_java_kotlin_programming.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class MockTest {
 public   synchronized static String[] MockTest(String input, Runnable runnable) {
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
}
