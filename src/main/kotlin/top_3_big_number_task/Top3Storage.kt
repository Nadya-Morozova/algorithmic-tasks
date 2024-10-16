package top_3_big_number_task

import top_3_big_number_task.data.NumberWithMentions

class Top3Storage(private val biggestValuesCount: Int) {

    private val biggestValues = mutableListOf<NumberWithMentions>()

    /**
     * Adds a number to the storage or increments its mention count if it already exists.
     * If the storage is full and the new number is bigger than the smallest number in the storage,
     * it replaces the smallest number.
     *
     * @param number the number to add to the storage
     */
    fun putNumber(number: Int) {
        var minValue: Int = Int.MAX_VALUE
        var minValueIndex = -1

        for (i in biggestValues.indices) {
            val current = biggestValues[i]

            if (current.value == number) {
                current.mentions++
                return
            }

            if (current.value < minValue) {
                minValue = current.value
                minValueIndex = i
            }
        }

        val numberWithMentions = NumberWithMentions(number, 1)
        if (biggestValues.size < biggestValuesCount) {
            biggestValues.add(numberWithMentions)
        } else if (minValueIndex != -1) {
            biggestValues[minValueIndex] = numberWithMentions
        }
    }

    /**
     * Prints the biggest numbers stored, sorted in descending order by their value.
     */
    fun printBiggestNumbers() = biggestValues.sortedByDescending { it.value }.forEach(::println)

}