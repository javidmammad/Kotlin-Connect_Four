fun main() {
    val squirrels = readLine()!!.toInt()
    val nuts = readLine()!!.toInt()
    val result = nuts % squirrels
    println(result)
}