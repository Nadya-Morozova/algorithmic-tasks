package calculate_average_task

/**
 *
 * Calculates and prints the arithmetic mean of all integers within a given range.
 *
 * @param from the starting value of the range (inclusive). Must be less than or equal to `to`.
 * @param to the ending value of the range (inclusive). Must be greater than or equal to `from`.
 *
 */
fun main() {
    calculateAverage(0, 750)
}

fun calculateAverage(from: Int, to: Int) {
    val sum = (from .. to).reduce { acc, number ->
        acc + number
    }

    println(sum / to)
}
