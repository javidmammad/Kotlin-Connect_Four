package connectfour

fun getSingleOrMultiple(): Pair<Int, String> {
    while (true) {
        println("Do you want to play single or multiple games?\n" +
                "For a single game, input 1 or press Enter\n" +
                "Input a number of games:")
        val digitOrEmpty = readLine()!!
        when {
            digitOrEmpty.isEmpty() || digitOrEmpty.toIntOrNull() == 1 -> return Pair(1, "Single game");
            digitOrEmpty.toIntOrNull() == null || digitOrEmpty.toInt() <= 0 -> println("Invalid input")
            else -> return Pair(digitOrEmpty.toInt(), "Total $digitOrEmpty games")
        }
    }
}