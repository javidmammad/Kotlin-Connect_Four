fun main() {
    val studentsCount = readLine()!!.toInt()
    var d = 0
    var c = 0
    var b = 0
    var a = 0
    repeat(studentsCount) {
        val grad = readLine()!!.toInt()
        if (grad == 2) d++ else if (grad == 3) c++ else if (grad == 4) b++ else if (grad == 5) a++
    }
    println("$d $c $b $a")
}