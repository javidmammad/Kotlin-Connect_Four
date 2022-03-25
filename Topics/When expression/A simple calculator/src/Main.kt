fun main() {
    val (first, operator, last) = readLine()!!.split(" ", ignoreCase = true)
    when (operator) {
        "+" -> println(first.toLong() + last.toLong())
        "-" -> println(first.toLong() - last.toLong())
        "/" -> when (last) {
            "0" -> println("Division by 0!")
            else -> println(first.toLong() / last.toLong())
        }
        "*" -> println(first.toLong() * last.toLong())
        else -> println("Unknown operator")
    }
}