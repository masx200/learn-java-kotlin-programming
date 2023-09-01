import org.example.isPrime

fun main(args: Array<String>) {
    var count = 0
    for (j in 2..100) {
        if (isPrime(j)) {
            count++
            println("素数$j")
        }
    }
    println("素数个数$count")
}

