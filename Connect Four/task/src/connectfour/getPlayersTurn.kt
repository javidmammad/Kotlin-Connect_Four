package connectfour

fun getPlayersTurn(board: MutableList<String>, firstName: String, secondName: String, chosenGame: Pair<Int, String>) {
    for (game in 1..chosenGame.first) {
        var isFirstPlayer = true
        var chosenColumnSet = mutableListOf<Pair<Int, Char>>()
        if (chosenGame.first != 1) {
            println("Game #$game")
        }
        if (game % 2 == 0) {
            isFirstPlayer = false
        }
        getBoardScheme(board)

        while (true) {
            println((if (isFirstPlayer) firstName else secondName) + "'s turn:")
            val playerInput = readLine()!!.toString()
            when {
                playerInput == "end" -> {
                    println("Game over!")
                    return
                }
                playerInput.toIntOrNull() == null -> println("Incorrect column number")
                playerInput.toInt() !in 1..board[2].toInt() -> println("The column number is out of range (1 - ${board[2].toInt()})")
                chosenColumnSet.count { it.first == playerInput.toInt() } == board[0].toInt() -> println("Column $playerInput is full")
                else -> {
                    chosenColumnSet.add(0, playerInput.toInt() to if (isFirstPlayer) 'o' else '*')
                    val alternativeColumnSet = chosenColumnSet.toMutableList()
                    val markedCoordinates = getBoardScheme(board, chosenColumnSet)
                    when {
                        markedCoordinates.size == board[0].toInt() * board[2].toInt() -> {
                            println("It is a draw")
                            firstPlayerScore += 1
                            secondPlayerScore += 1
                            break
                        }
                        getWinner(markedCoordinates) -> {
                            if (isFirstPlayer) {
                                println("Player $firstName won")
                                firstPlayerScore += 2
                            } else {
                                println("Player $secondName won")
                                secondPlayerScore += 2
                            }
                            break
                        }
                        else -> {
                            chosenColumnSet = alternativeColumnSet.toMutableList()
                            isFirstPlayer = !isFirstPlayer
                        }
                    }
                }
            }
        }
        println("Score\n$firstName: $firstPlayerScore $secondName: $secondPlayerScore")
    }
    println("Game over!")
}