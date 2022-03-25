fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    var counter = 0
    if(first>0){
        counter++
    }
    if(second>0){
        counter++
    }
    if(third>0){
        counter++
    }
    println(counter == 1)
}