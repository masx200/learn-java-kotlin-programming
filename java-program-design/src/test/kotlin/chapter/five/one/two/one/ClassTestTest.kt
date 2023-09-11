package chapter.five.one.two.one

import org.example.MockTest
import org.junit.jupiter.api.Test

internal class ClassTestTest {
    @Test
    fun maintest() {
        println(MockTest.MockTest("java.util.Date\n") { ClassTest.main(arrayOf()) }
            .contentToString())
    }
}