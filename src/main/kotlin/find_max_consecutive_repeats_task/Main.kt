package find_max_consecutive_repeats_task

/**
 * Prints the character with the most consecutive repeats in the given string and the count of those repeats.
 *
 * @param text The input string in which to find the character with maximum consecutive repeats.
 */
fun main() {
    printMaxConsecutiveRepeats("aaabbbb cccc ddee")
}

fun printMaxConsecutiveRepeats(text: String) {
    var maxRepeats = 0
    var letterWithMaxRepeats = ' '

    var currentRepeats = 1

    text.forEachIndexed { index, char ->
        if (index != 0) {
            val prevChar = text[index - 1]
            if (char == prevChar) {
                currentRepeats++
            } else {
                if (currentRepeats > maxRepeats) {
                    maxRepeats = currentRepeats
                    letterWithMaxRepeats = prevChar
                }

                currentRepeats = 1
            }
        }
    }

    println("$letterWithMaxRepeats - $maxRepeats")
}