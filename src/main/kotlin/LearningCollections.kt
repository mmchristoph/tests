
fun main() {
    val col = arrayListOf("banana", "abacaxi", 1)
    col.add("abacate")
    println(col)

    println(HashSet::class.java)

    println(col.last())
    println(col.first())

    var n = setOf(1, 2, 30)
    println(n.max())
    println(n.size)
    n = n.plus(4)
    n = n.plusElement(1)
    println(n)
}
