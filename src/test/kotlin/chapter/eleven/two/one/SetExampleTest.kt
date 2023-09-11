package chapter.eleven.two.one

import org.junit.jupiter.api.Test

internal class SetExampleTest {
    @Test
    fun mainTest() {
        SetExample.main(arrayOf("hello", "world"))
    }

    @Test
    fun mainTest2() {
        SetExample.main(arrayOf("she", "said", "she", "is", "signorina"))
    }
}