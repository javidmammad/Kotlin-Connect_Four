import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val word = scan.nextLine()
    print("${word.length} repetitions of the word $word: ${word.repeat(word.length)}")
}