@Suppress("all")
fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimer(timerValue)
    println("${timer.time}")
}

data class ByteTimer constructor(var time: Int) {
    init {
        this.time = when {
            time < -128 -> -128
            time > 127 -> 127
            else -> time
        }
    }
}