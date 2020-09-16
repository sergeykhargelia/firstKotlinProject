fun prime(n: Int): Boolean {
    var currentDivisor = 2
    while (currentDivisor * currentDivisor <= n) {
        if (n % currentDivisor == 0) {
            return false
        }
        currentDivisor++
    }
    return true
}

fun main() {
    val n = readLine()!!.toInt()
    if (prime(n)) {
        println("$n is a prime number")
    }
    else {
        println("$n is not a prime number")
    }
}