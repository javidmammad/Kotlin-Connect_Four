fun main() {
    val year = readLine()!!.toInt()
    val isLeap = if (year % 4 == 0 ){
       if (year % 100 == 0) year % 400 == 0 else true
    }else {
        false
    }
    println(if (isLeap) "Leap" else "Regular")
}