import java.util.TreeMap

fun main() {
    val binaryReprentation = TreeMap<Char, String>()

    for (c in 'A'..'X') {
        val binary = Integer.toBinaryString(c.code)
        binaryReprentation[c] = binary
    }

    for ((ch, bin) in binaryReprentation) {
        println("$ch - $bin")
    }
}