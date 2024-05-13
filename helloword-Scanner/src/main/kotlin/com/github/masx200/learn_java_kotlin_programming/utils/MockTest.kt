package com.github.masx200.learn_java_kotlin_programming.utils

import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.nio.charset.StandardCharsets

@Synchronized
fun MockTest(input: String, runnable: Runnable): Array<String> {
    val orig = System.out
    val os = ByteArrayOutputStream()
    System.setOut(PrintStream(os, false, StandardCharsets.UTF_8))
    val orige = System.err
    val ose = ByteArrayOutputStream()
    System.setErr(PrintStream(ose, false, StandardCharsets.UTF_8))
    val `is` = System.`in`
    System.setIn(ByteArrayInputStream(input.toByteArray()))
    try {
        runnable.run()
    } finally {
        System.setOut(orig)
        System.setErr(orige)
        System.setIn(`is`)
    }
    return arrayOf(
        os.toString(StandardCharsets.UTF_8),
        ose.toString(StandardCharsets.UTF_8)
    )
}