import kotlin.math.sqrt

fun isPrime(n: Int): Boolean {
    for (i in 2..sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}