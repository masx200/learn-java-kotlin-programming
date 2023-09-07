package chapter.eight.two.two

class Hello : Thread() {

    var i = 0
    override fun run() {
        while (true) {
            println("Hello" + i++)
            if (
                i == 5) break

        }
    }
}