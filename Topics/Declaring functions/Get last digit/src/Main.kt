// write your code here

/* Do not change code below */
fun main() {
    val a = readLine()!!
    println(getLastDigit(a))
}

fun getLastDigit(input: String) = input.last()