fun main() {
    val length = readLine()!!.toInt()
    var minVal: Int? = null
    repeat(length) {
        val value = readLine()!!.toInt()
        if (minVal == null ||  minVal!! > value) {
            minVal = value
        }
    }
    println(minVal)
}