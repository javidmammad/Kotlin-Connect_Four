fun main() {
    val input = readLine()!!
    var isPal = "yes"
    for (index in 0..input.lastIndex) {
       if (input[index] != input[input.lastIndex - index]) {
           isPal = "no"
           break
       }
    }
    println(isPal)
}