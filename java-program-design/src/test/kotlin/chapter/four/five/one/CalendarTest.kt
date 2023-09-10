package chapter.four.five.one

import org.example.MockTest
import org.junit.jupiter.api.Test

internal class CalendarTest {
    @Test
    fun maintest() {
        println(MockTest.MockTest("2003\n") {
            Calendar.main(arrayOf())
        }.contentToString())
    }
}