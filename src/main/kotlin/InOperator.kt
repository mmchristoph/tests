fun isLetter(ch: Char) = ch in 'a'..'z' || ch in 'A'..'Z'

fun isDigit(ch: Char) = ch in '0'..'9'

fun main() {
    val ch = arrayOf('a', '1')

    ch.forEach { c ->
        println("$c\nisLetter = ${isLetter(c)}\nisDigit = ${isDigit(c)}\n")
    }
}