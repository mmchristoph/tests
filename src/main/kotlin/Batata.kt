fun main() {
    println("3 ou 4? ${greater1(3, 4)}")
    println(greater2(7, 8))
    val n = Operation(1, 2)
    println(n.greater3())
    checkVar()
    listOf(1, 2, 3).forEach { n -> printAny(n, n) }
}

//corpo de expressao
fun greater1(a: Int, b: Int) = if (a > b) a else b

//corpo de bloco
fun greater2(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun printAny(i: Int, o: Int) = println("$i $o")

fun checkVar() {
    var teste = "christoph"
    println(teste)
    teste = "uriel"
    println(teste)
}

//objeto
class Operation(private val a: Int, private val b: Int) {
    fun greater3(): Int {
        return if (a > b) a else b
    }
}

class Person(val firstName: String = "Uriel", val lastName: String = "Teixeira") {

    lateinit var gender: String

    init {
        println("firstName = $firstName \nlastName = $lastName")
        println("fullName = ${fullName(firstName, lastName)}")
    }

    fun personGender(): String {
        return gender
    }

    private fun fullName(fn: String, ln: String): String {
        return "$firstName $lastName"
    }

    override fun toString(): String {
        return ""
    }
}

