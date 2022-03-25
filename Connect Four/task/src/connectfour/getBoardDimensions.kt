package connectfour

fun getBoardDimensions(): MutableList<String> {
    var board: MutableList<String>
    while (true) {
        println("Set the board dimensions (Rows x Columns)\n" + "Press Enter for default (6 x 7)")
        board = readLine()!!.filter { !it.isWhitespace() }.map { it.uppercaseChar() }.joinToString("").split('X') as MutableList<String>
        when {
            board.joinToString("").isEmpty() -> return mutableListOf("6", "X", "7")
            board.size <= 1 || board.first().isEmpty() || board.last().isEmpty() -> println("Invalid input")
            board.first().toString().toIntOrNull() == null || board.last().toString().toIntOrNull() == null -> println("Invalid input")
            board.first().toString().toInt() !in 5..9 -> println("Board rows should be from 5 to 9")
            board.last().toString().toInt() !in 5..9 -> println("Board columns should be from 5 to 9")
            else -> break
        }
    }
    board.add(1, "X")
    return board
}