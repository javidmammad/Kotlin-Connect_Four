const val ONE = 1
fun main() {
    val input = readLine()!!
    val output = mutableListOf<Any>()
    for (item in input) {
        if (output.size >= 2 && output[output.lastIndex - 1] == item) {
           output[output.lastIndex] = output.last().toString().toInt() + ONE
        } else {
            output.add(item)
            output.add(1)
        }
    }
    println(output.joinToString(""))
}