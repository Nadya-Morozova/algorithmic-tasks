package find_the_sum_of_9Digit_number_task

/**
 *
 * Calculates and prints the sum of the digits of a given integer.
 *
 * @param number the integer whose digits will be summed. Must be a non-negative integer.
 *
 * The function processes each digit of the integer, sums them up, and prints the result.
 *
 */
fun main() {
    findTheSum(123456789)
}

fun findTheSum(number: Int) {
    var currentNumber = number
    var sum = 0

    while (0 < currentNumber) {
        sum += currentNumber % 10
        currentNumber /= 10
    }

    println(sum)
}