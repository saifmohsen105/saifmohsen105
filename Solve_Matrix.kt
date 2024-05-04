import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Please write row matrix 1 -> ")
    val row1 = scanner.nextInt()
    print("Please write column matrix 1 -> ")
    val column1 = scanner.nextInt()
    print("Please write row matrix 2 -> ")
    val row2 = scanner.nextInt()
    print("Please write column matrix 2 -> ")
    val column2 = scanner.nextInt()

    val matrix1 = Array(row1) { IntArray(column1) }
    val matrix2 = Array(row2) { IntArray(column2) }

    for (i in 0 until column1) {
        for (j in 0 until row1) {
            print("Please write matrix 1 (${j + 1},${i + 1}) -> ")
            matrix1[j][i] = scanner.nextInt()
        }
    }
    println("--------------------------------")
    for (i in 0 until column2) {
        for (j in 0 until row2) {
            print("Please write matrix 2 (${j + 1},${i + 1}) -> ")
            matrix2[j][i] = scanner.nextInt()
        }
    }
    println("--------------------------------")
    for (i in 0 until column1) {
        for (j in 0 until row1) {
            print(" matrix 1 (${j + 1},${i + 1}) = ${matrix1[j][i]}\t")
        }
        println()
    }
    println("--------------------------------")
    for (i in 0 until column2) {
        for (j in 0 until row2) {
            print(" matrix 2 (${j + 1},${i + 1}) = ${matrix2[j][i]}\t")
        }
        println()
    }
    println("--------------------------------")
    print("Do you want to perform multiplication, subtraction, or addition? (1, 2, 3) -> ")
    val question = scanner.nextInt()
    println("--------------------------------")

    when (question) {
        1 -> {
            if (column1 != row2) {
                println("Cannot perform matrix multiplication!")
                return
            }
            val multiplication = Array(row1) { IntArray(column2) }
            for (i in 0 until row1) {
                for (j in 0 until column2) {
                    for (k in 0 until column1) {
                        multiplication[i][j] += matrix1[i][k] * matrix2[k][j]
                    }
                }
            }
            for (i in 0 until column2) {
                for (j in 0 until row1) {
                    print("${multiplication[j][i]}\t")
                }
                println()
            }
        }
        2 -> {
            val subtraction = Array(row1) { IntArray(column1) }
            for (i in 0 until row1) {
                for (j in 0 until column1) {
                    subtraction[i][j] = matrix1[i][j] - matrix2[i][j]
                }
            }
            for (i in 0 until column1) {
                for (j in 0 until row1) {
                    print("${subtraction[j][i]}\t")
                }
                println()
            }
        }
        3 -> {
            val addition = Array(row1) { IntArray(column1) }
            for (i in 0 until row1) {
                for (j in 0 until column1) {
                    addition[i][j] = matrix1[i][j] + matrix2[i][j]
                }
            }
            for (i in 0 until column1) {
                for (j in 0 until row1) {
                    print("${addition[j][i]}\t")
                }
                println()
            }
        }
        else -> println("^__Error__^")
    }
}