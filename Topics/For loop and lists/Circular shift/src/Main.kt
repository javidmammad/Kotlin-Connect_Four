fun main() {
    MutableList(readLine()!!.toInt()) { readLine()!!.toInt() }.also {
        it.add(0, it[it.lastIndex])
        it.removeAt(it.lastIndex)
    }.forEach { item -> print("$item ") }
}