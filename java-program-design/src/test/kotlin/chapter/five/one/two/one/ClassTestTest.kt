package chapter.five.one.two.one

import com.github.masx200.learn_java_kotlin_programming.utils.MockTest
import org.junit.jupiter.api.Test

internal class ClassTestTest {
    @Test
    fun maintest() {
        println(MockTest.MockTest("java.util.Date\n") { ClassTest.main(arrayOf()) }
            .contentToString())
    }
}