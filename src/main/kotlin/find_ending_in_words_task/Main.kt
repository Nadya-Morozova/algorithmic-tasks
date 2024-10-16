package find_ending_in_words_task

/**
 * Finds and prints words that end with "ful" from a space-separated string of words.
 *
 * @param words a string containing space-separated words to search through
 */
fun main() {
    findEndingInWords("helpful kind honest peaceful beautiful")
}

fun findEndingInWords(words: String) {
    var currentWord = StringBuilder()

    for (i in words.indices) {
        val reachedTheEndOfTheWord = words[i] == ' ' || i == words.length - 1

        if (!reachedTheEndOfTheWord) {
            currentWord.append(words[i])
            continue
        }

        val theLastWord = i == words.length - 1 && words[i] != ' '
        if (theLastWord) {
            currentWord.append(words[i])
        }

        val correctEnding = currentWord.length >= 3 &&
                currentWord[currentWord.length - 3] == 'f' &&
                currentWord[currentWord.length - 2] == 'u' &&
                currentWord[currentWord.length - 1] == 'l'
        if (correctEnding) {
            println(currentWord)
        }

        currentWord = StringBuilder()
    }
}