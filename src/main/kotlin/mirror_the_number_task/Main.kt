package mirror_the_number_task

/**
 *
 * Reverses the digits of the given number and returns it as a string.
 *
 * @param number the number to be reversed
 * @return the reversed number as a string
 *
 */
fun main() {
    println(mirrorTheNumber(4321))
}

fun mirrorTheNumber(number: Int): String {
    val numberString = number.toString()
    val reversedNumber = StringBuilder()
    for (index in numberString.length - 1 downTo 0) {
        reversedNumber.append(numberString[index])
    }
    return reversedNumber.toString()
}