fun main() {
   val input = readLine()!!.toInt()
   val list: MutableList<Int> = mutableListOf()
   for (digit in 1..input) {
      for (i in 1..digit) {
         list.add(digit)
      }
   }
   list.filterIndexed { index, _ -> index + 1 <= input }.also { print(it.joinToString(" ")) }
}