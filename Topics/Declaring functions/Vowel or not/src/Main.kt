// write your function here

fun main() {
    val letter = readLine()!!.first()
    println(isVowel(letter))
}

fun isVowel(letter: Char): Boolean = "aeiouAEIOU".toCharArray().contains(letter)