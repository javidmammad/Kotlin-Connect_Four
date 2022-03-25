fun main() {
    MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }.contains(readLine()!!.toInt())
        .let { println(if (it) "YES" else "NO") }
}