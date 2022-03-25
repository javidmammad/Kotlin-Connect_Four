fun main() {
    val str = readLine()!!
    println(str.replaceFirst(str[0], str[str.lastIndex]).substring(0, str.lastIndex) + str.first())
}