package org.example

import org.junit.jupiter.api.Test


class MainKtTest {

    @Test
    fun mainTest() {

        val result = MockTest("9\n5\n") {
            main(arrayOf())
        }
        println(result.contentToString())
    }

    @Test
    fun mainTest2() {

        val result = MockTest("9\n15\n") {
            main(arrayOf())
        }
        println(result.contentToString())
    }

    @Test
    fun mainTest3() {

        val result = MockTest("-9\n-5\n") {
            main(arrayOf())
        }
        println(result.contentToString())
    }

    @Test
    fun mainTest4() {

        val result = MockTest("-2\n-5\n") {
            main(arrayOf())
        }
        println(result.contentToString())
    }
}

