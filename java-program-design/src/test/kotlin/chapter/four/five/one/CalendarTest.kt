package chapter.four.five.one

import com.github.masx200.learn_java_kotlin_programming.utils.MockTest
import org.junit.jupiter.api.Test

internal class CalendarTest {
    @Test
    fun maintest() {
        println(MockTest.MockTest("2003\n") {
            Calendar.main(arrayOf())
        }.contentToString())
    }
}