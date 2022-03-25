import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val firstRange = scan.nextInt()..scan.nextInt()
    val secondRange = scan.nextInt()..scan.nextInt()
    val value = scan.nextInt()
    println(value in firstRange || value in secondRange)
}