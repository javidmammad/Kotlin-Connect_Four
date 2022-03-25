fun main() {
    MutableList(100) {}.mapIndexed { idx, _ -> if ("$idx".matches(Regex("0|9|99"))) idx + 1 else 0 }
        .joinToString()
        .let(::println)
}