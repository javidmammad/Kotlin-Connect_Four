package connectfour

import kotlin.math.abs

fun getWinner(coordinates: MutableList<Pair<Pair<Int, Int>, Char>>): Boolean {

    var counter = 0
    for (sequence in mutableListOf(coordinates.filter { it.second == 'o' }, coordinates.filter { it.second == '*' })) {
        for (item in sequence) {
            val (first, second) = item.first

            if (sequence.count{ first == it.first.first } >= 4) {
                counter = 0
                sequence.filter { first == it.first.first }.sortedBy { it.first.second }
                    .zipWithNext { a, b ->
                        when {
                            abs(a.first.second - b.first.second) == 1 -> counter++
                            counter <= 3 -> counter = 0
                            else -> {}
                        }}
            }
            if (sequence.count{ second == it.first.second } >= 4) {
                counter = 0
                sequence.filter { second == it.first.second }.sortedBy { it.first.first }
                    .zipWithNext { a, b ->
                        when {
                            abs(a.first.first - b.first.first) == 1 -> counter++
                            counter <= 3 -> counter = 0
                            else -> {}
                        }}
            }
            if (sequence.count { it.first.first == it.first.second } >= 4) {
                counter = 0
                sequence.filter { it.first.first == it.first.second }.sortedBy { it.first.first }
                    .zipWithNext { a, b ->
                        when {
                            abs(a.first.first - b.first.first) == 1 -> counter++
                            counter <= 3 -> counter = 0
                            else -> {}
                        }}
            }
            if (sequence.count { it.first.first + it.first.second == first + second } >= 4) {
                counter = 0
                sequence.filter { it.first.first + it.first.second == first + second }.sortedBy {
                    when {
                        first > second -> second
                        else -> first
                    }}
                    .zipWithNext { a, b ->
                        when {
                            a.first.first + a.first.second == b.first.first + b.first.second
                                    && abs(a.first.first - b.first.first) == 1 -> counter++
                            counter <= 3 -> counter = 0
                            else -> {}
                        }}
            }

        }
        if (counter >= 3) {
            return true
        }
    }
    return false
}