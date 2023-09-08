import java.util.Scanner

fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)
    println("输入两个数字")
    val a = `in`.nextLong()
    val b = `in`.nextLong()
    val jieguo =
        if (b in 3..<a) a + b
        else if (a < b || b >= 4) a * b
        else a - b
    println(jieguo)
}