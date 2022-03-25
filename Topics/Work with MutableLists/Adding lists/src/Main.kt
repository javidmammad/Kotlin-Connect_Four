fun main() {
    val firstList = readLine()!!.split(' ').map { it }.toMutableList()
    val secondList = readLine()!!.split(' ').map { it }.toMutableList()
    firstList.addAll(secondList)
    firstList.joinToString().let(:: println)

}