package org.example

import org.junit.jupiter.api.Test

internal class MainTest {
    @Test
    fun mainTest() {
        val result = MockTest.MockTest("3 9 20 null null 15 7 !\n") { Main.main(arrayOf()) }
        println(result.contentToString())
    }
}