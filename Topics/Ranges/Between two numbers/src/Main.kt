import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val value = scan.nextInt()
    val range = scan.nextInt()..scan.nextInt()
    println(value in range)
}