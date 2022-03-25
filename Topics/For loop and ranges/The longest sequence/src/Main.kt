fun main() {
    val amount = readLine()!!.toInt()
    var length = 0
    val lengthsList = mutableListOf<Int>()
    var maxNum = 0
    repeat(amount) {
        val num = readLine()!!.toInt()
        if (num >= maxNum) {
            length++
        } else {
            lengthsList.add(length)
            length = 1
        }
        maxNum = num
    }
    lengthsList.add(length)
    println(lengthsList.maxOrNull())
}