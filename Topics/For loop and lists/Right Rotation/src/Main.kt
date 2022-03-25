fun main() {
    val list = MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }
    val shift = readLine()!!.toInt() % (list.lastIndex + 1)
    if (shift > 0) {
        for (el in 1..shift) {
            list.add(0, list[list.lastIndex]).also { list.removeAt(list.lastIndex) }
        }
    }

    list.joinToString(" ").let(::println)
}