import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val firstRange = scanner.next().toInt()..scanner.next().toInt()
    val secondRange = scanner.next().toInt()..scanner.next().toInt()
    val value = scanner.next().toInt()
    println(value in firstRange && value in secondRange)
}