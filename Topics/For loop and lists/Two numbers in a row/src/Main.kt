fun main() {
    val str1 = MutableList(readLine()!!.toInt()) { readLine()!! }.joinToString(" ")

    val str2 = readLine()!!

    val res = str1.contains(str2) || str1.contains(str2.reversed())

    println(if (res) "NO" else "YES")
}