import demo.date.Date

fun main(args: Array<String>) {
    val date = Date()
    date.setDate(10, 2, 1111)
    println("date:")
    date.showDate()
}