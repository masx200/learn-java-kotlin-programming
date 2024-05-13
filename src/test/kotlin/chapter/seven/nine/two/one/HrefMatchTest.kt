package chapter.seven.nine.two.one

import com.github.masx200.learn_java_kotlin_programming.utils.MockTest
import org.junit.jupiter.api.Test

internal class HrefMatchTest {
    @Test
    fun maintest() {
        println(MockTest.MockTest("https://www.eduexam.cn/\n") { HrefMatch.main(arrayOf()) }
            .contentToString())
    }
}
