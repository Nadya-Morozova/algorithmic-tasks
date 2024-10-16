package draw_stars_task

/**
 * Draws different triangle figures with stars.
 *
 * @param count The number of rows in the figure.
 */
fun main() {
    val count = 6

    drawFirstFigure(count)
    println()

    drawSecondFigure(count)
    println()

    drawThirdFigure(count)
    println()

    drawFourthFigure(count)
}


// *
// * *
// * * *
// * * * *
fun drawFirstFigure(count: Int) {
    for (i in 0 until count) {
        for (j in 0 until count) {
            if (j > i) {
                print("  ")
            } else {
                print("* ")
            }
        }
        println()
    }
}


// * * * *
// * * *
// * *
// *
fun drawSecondFigure(count: Int) {
    for (i in 0 until count) {
        for (j in 0 until count - i) {
            print("* ")
        }
        println()
    }
}


// * * * *
//   * * *
//     * *
//       *
fun drawThirdFigure(count: Int) {
    for (i in 0 until count) {
        for (j in 0 until count) {
            if (j < i) {
                print("  ")
            } else {
                print("* ")
            }
        }
        println()
    }
}


//       *
//     * *
//   * * *
// * * * *
fun drawFourthFigure(count: Int) {
    for (i in 0 until count) {
        for (j in 0 until count) {
            if (i + j >= count - 1) {
                print("* ")
            } else {
                print("  ")
            }
        }
        println()
    }
}