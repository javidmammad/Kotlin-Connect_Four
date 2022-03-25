fun main() {
    val n = readLine()!!.toInt()
    val list = MutableList(n) { readLine()!!.toInt() }
    println(if (list == list.sorted()) "YES" else "NO")
}