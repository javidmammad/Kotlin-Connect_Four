fun main() {
    val list = readLine()!!.split(", ").map { it }.toMutableList()
    list.add(readLine()!!).also { list.joinToString().let(::println) }
}