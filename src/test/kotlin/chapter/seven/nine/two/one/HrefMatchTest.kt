package chapter.seven.nine.two.one

import org.junit.jupiter.api.Test

internal class HrefMatchTest {
    @Test
    fun maintest() {
        println(MockTest.MockTest("https://www.eduexam.cn/\n") { HrefMatch.main(arrayOf()) }
            .contentToString())
    }
}
