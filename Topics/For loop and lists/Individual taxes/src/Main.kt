fun main() {
    val amount = readLine()!!.toInt()
    val companyData = MutableList(amount * 2) { readLine()!!.toInt() }
    val resultList = companyData.zip(companyData.drop(amount)) { a, b -> a * b }

    println(resultList.indexOf(resultList.maxOrNull()) + 1)
}