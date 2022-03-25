fun main() {
    val input = readLine()!!.first()
    val isTrue = input.isUpperCase() || input.isDigit() && input != '0'
    print(isTrue)
}