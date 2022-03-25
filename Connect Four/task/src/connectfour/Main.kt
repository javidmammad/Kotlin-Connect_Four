package connectfour

var firstPlayerScore = 0;
var secondPlayerScore = 0;
var gamesCount: Int = 0
fun main() {
    println("Connect Four")
    println("First player's name:")
    val firstName = readLine()!!
    println("Second player's name:")
    val secondName = readLine()!!
    val boardSizes = getBoardDimensions()
    val chosenGame = getSingleOrMultiple()
    gamesCount = chosenGame.first
    println("$firstName VS $secondName")
    println("${boardSizes.joinToString(" ")} board")
    println(chosenGame.second)
    getPlayersTurn(boardSizes, firstName, secondName, chosenGame)
}