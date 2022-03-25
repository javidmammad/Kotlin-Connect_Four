fun main() {
    readLine()?.let {
        when (it.firstOrNull()) {
            'i' -> it.drop(1).toInt() + 1
            's' -> it.drop(1).reversed()
            else -> it
        }.let(:: println)
    }
}