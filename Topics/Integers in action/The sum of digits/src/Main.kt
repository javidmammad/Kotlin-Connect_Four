fun main() {
    val thDig: Int = readLine()!!.toInt()
    val first = thDig / 100
    val sec = (thDig - first * 100) / 10
    val third = thDig - (thDig / 10) * 10
    println(first + sec + third)
}