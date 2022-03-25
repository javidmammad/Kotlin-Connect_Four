fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    println(if (a >= b && a >= c) {
       a
    } else if(b >= a && b >= c ) {
        b
    }else c
    )
}