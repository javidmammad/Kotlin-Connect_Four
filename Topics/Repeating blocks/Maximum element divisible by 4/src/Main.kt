fun main() {
    val num = readLine()!!.toInt()
    var deviseByFour = 0
    if (num < 1000) repeat(num){
        val input = readLine()!!.toInt()
        if (input % 4 == 0 && input > deviseByFour) deviseByFour = input
    }
    print(deviseByFour)
}