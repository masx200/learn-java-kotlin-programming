package chapter.eight.two.one

class Hello : Runnable {

    var i = 0
    override fun run() {
        while (true) {
            println("Hello" + i++)
            if (
                i == 5) break

        }
    }
}