import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val first = scan.nextLine()
    val second = scan.nextLine()
    println("${first.replace(" ",":")} ${second.replace(" ", "/")}")
}
