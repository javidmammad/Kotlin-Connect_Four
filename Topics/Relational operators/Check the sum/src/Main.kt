fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val isSumOfTwoIs20 = (first + second) == 20 || (first + third) == 20 || (second + third) == 20
    println(isSumOfTwoIs20)
}