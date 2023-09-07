package chapter.eight.two.two

class ThreadTest2 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val t1 = Hello()
            val t2 = Hello()
            t1.start()
            t2.start()
        }
    }
}