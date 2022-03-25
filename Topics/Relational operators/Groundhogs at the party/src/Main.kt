fun main() {
    val butterCups: Int = readLine()!!.toInt()
    val isWeekend: Boolean = readLine()!!.toBoolean()
    val isSuccessful = if(isWeekend) {
        butterCups in 15..25
    }else {butterCups in 10..20}
    print(isSuccessful)
}