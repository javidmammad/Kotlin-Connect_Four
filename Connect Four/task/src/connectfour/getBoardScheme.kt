package connectfour

fun getBoardScheme(board: MutableList<String>, playerInputs: MutableList<Pair<Int, Char>> = mutableListOf()): MutableList<Pair<Pair<Int, Int>, Char>> {
    for (column in 1..board[2].toInt()) {
        print(" $column")
    }
    println()
    val marksCoordinates = mutableListOf<Pair<Pair<Int, Int>, Char>>()

    for (row in 1..board[0].toInt()) {
        for (column in 0..board[2].toInt()) {
            val isCanBePut = playerInputs.count { it.first == column } > board[0].toInt() - row
            if(isCanBePut) {
                playerInputs.firstOrNull { it.first == column }
                    .also {
                        if (it != null) {
                            marksCoordinates.add( row to column to it.second )
                            print(it.second)
                        }
                        playerInputs.remove(it)
                    }
            }
            print("║")
            if (playerInputs.count { input -> input.first == column + 1 } <= board[0].toInt() - row) {
                print(" ")
            }
        }
        println()
    }
    for (column in 0..board[2].toInt()) {
        when (column) {
            0 -> print("╚")
            board[2].toInt() -> print("═╝")
            else -> print("═╩")
        }
    }
    println()
    return marksCoordinates
}