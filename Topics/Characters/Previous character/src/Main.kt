fun main() {
    CharArray(4){ readLine()!!.first()}.sorted().forEach { chr -> println(chr - 1) }
}