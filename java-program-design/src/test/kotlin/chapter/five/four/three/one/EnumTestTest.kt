package chapter.five.four.three.one

import org.example.MockTest
import org.junit.jupiter.api.Test

internal class EnumTestTest {
    @Test
    fun maintest() {
        println(MockTest.MockTest("SMALL\n") { EnumTest.main(arrayOf()) }.contentToString())
    }

    @Test
    fun maintest2() {
        println(MockTest.MockTest("EXTRA_EXTRA_LARGE\n") { EnumTest.main(arrayOf()) }
            .contentToString())
    }

    @Test
    fun maintest3() {
        println(MockTest.MockTest("EXTRA_LARGE\n") { EnumTest.main(arrayOf()) }
            .contentToString())
    }

    @Test
    fun maintest4() {
        println(MockTest.MockTest("LARGE\n") { EnumTest.main(arrayOf()) }.contentToString())
    }

    @Test
    fun maintest5() {
        println(MockTest.MockTest("MEDIUM\n") { EnumTest.main(arrayOf()) }.contentToString())
    }
}