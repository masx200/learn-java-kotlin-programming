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
}

