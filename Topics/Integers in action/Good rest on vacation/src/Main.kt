fun main() {
    val day = readLine()!!.toInt()
    val foodPerDay = readLine()!!.toInt()
    val flightCost = readLine()!!.toInt()
    val oneNightCost = readLine()!!.toInt()

    val result = day * foodPerDay + (day-1) * oneNightCost + 2*flightCost
    println(result)
}