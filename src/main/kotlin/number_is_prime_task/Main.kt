package number_is_prime_task

/**
 *
 * Finds and prints all prime numbers from 3 up to a given number `n`.
 *
 * @param n the upper limit up to which to find prime numbers
 *
 */
fun main() {
    numberIsPrime(30)
}

fun numberIsPrime(n: Int) {
    val primeNumbers = mutableListOf<Int>()

    for (number in 3..n step 2) {
        if (isPrime(number)) {
            primeNumbers.add(number)
        }
    }

    println(primeNumbers)
}

fun isPrime(number: Int): Boolean {
    for (i in 2..<number) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}