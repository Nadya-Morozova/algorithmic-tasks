package calculate_percent_of_bank_task

/**
 * Calculates and prints the progressive amount and profit over a specified number of months.
 *
 * @param startAmount The initial amount of money.
 * @param percentage The monthly percentage increase.
 * @param countOfMonth The number of months for which the calculation is to be performed.
 */
fun main() {
    calculatePercentForAmount(
        startAmount = 1000.0,
        percentage = 0.02,
        countOfMonth = 20
    )
}

fun calculatePercentForAmount(startAmount: Double, percentage: Double, countOfMonth: Int) {
    var amount = startAmount
    println("Start amount: $amount\n")
    for (i in 1..countOfMonth) {
        val profit = amount * percentage
        amount += profit
        println("Income of $i month - ${formattingAmount(amount)} (+ ${formattingAmount(profit)})")
    }
}

fun formattingAmount(value: Double): String {
    return "%.2f".format(value)
}