import kotlin.math.abs

fun main() {
    val firstCord = readLine()!!.split(' ')
    val secondCord = readLine()!!.split(' ')
    val difference = firstCord.zip(secondCord){ el1, el2 -> abs(el1.toInt() - el2.toInt()) }.sorted()
    println(if(difference[0] == 1 && difference[1] == 2) "YES" else "NO")
}