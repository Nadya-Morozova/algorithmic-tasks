package top_3_big_number_task

/**
 * The main function demonstrating the functionality of the Top3Storage class.
 * It creates a list of numbers and stores the top 3 unique numbers in the storage.
 * Then it prints the top 3 numbers in descending order.
 */
fun main() {
    val numbers = listOf(1, 9, 8, 9, 7, 8, 9, 10)
    val top3Storage = Top3Storage(3)

    for (number in numbers) {
        top3Storage.putNumber(number)
    }

    top3Storage.printBiggestNumbers()
}
