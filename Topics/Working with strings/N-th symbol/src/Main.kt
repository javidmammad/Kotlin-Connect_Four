fun main() {
    val str = readLine()!!
    val index = readLine()!!.toInt()
    println("Symbol # $index of the string \"${str}\" is '${str[index - 1]}'")
}