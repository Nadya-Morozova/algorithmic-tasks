package palindrome_task

/**
 *
 * Checks if the given number is a palindrome.
 *
 * @param input the number to be checked
 * @return true if the number is a palindrome, false otherwise
 *
 */
fun main() {
    println(checkIfNumberPalindrome(12321))
    println(checkIfNumberPalindrome(123321))
    println(checkIfNumberPalindrome(123421))
    println(checkIfNumberPalindrome(11321))
}

fun checkIfNumberPalindrome(input: Int): Boolean {
    val numberString = input.toString()
    val length = numberString.length

    for (i in 0 until length / 2) {
        if (numberString[i] != numberString[length - i - 1]) {
            return false
        }
    }

    return true
}