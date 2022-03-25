fun main() {
    val firstBox = readLine()!!.split(' ').sortedBy { it -> it.toInt() }.map { it.toInt() }
    val secondBox = readLine()!!.split(' ').sortedBy { it -> it.toInt() }.map { it.toInt() }
    if(firstBox[0] == secondBox[0] && firstBox[1] == secondBox[1] && firstBox[2] == secondBox[2]){
        println("Box 1 = Box 2")
    }else if(firstBox[0] >= secondBox[0] && firstBox[1] >= secondBox[1] && firstBox[2] >= secondBox[2]){
        println("Box 1 > Box 2")
    }else if(firstBox[0]  <= secondBox[0] && firstBox[1] <= secondBox[1] && firstBox[2] <= secondBox[2]){
        println("Box 1 < Box 2")
    }else {
        println("Incomparable")
    }
 }