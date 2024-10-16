package find_a_numeric_digits_task

/**
 *
 * Extracts and prints the ones (units) and tens digits of the given number.
 *
 * @param number the number from which to extract the digits
 *
 */
fun main() {
    findANumericDigits(1234567)
}

fun findANumericDigits(number: Int) {
    val units = number % 10
    val tens = (number / 10) % 10

    println("Ones = $units\nTens = $tens")
}