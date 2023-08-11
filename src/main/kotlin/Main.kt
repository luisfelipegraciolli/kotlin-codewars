import kotlin.math.pow

fun main(args: Array<String>) {
    println(squareSum(arrayOf(1, 2, 2)))
}

fun squareSum(n: Array<Int>): Int {
    var soma: Double = 0.0

    for (i in n) {
        soma += i.toDouble().pow(2.0)
    }

    return soma.toInt()
}