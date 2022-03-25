fun main() {
    val numbers = List(readLine()!!.toInt()) { readLine()!!.toInt() }
    val number = readLine()!!.toInt()

    print(numbers.count { it == number })
}
