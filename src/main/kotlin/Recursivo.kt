interface Expressao
class Numero(val valor: Int) : Expressao
class Soma(val direita: Expressao, val esquerdo: Expressao) : Expressao

interface Tipo
class Letra(val str: String) : Tipo
class Digito(val n: Int) : Tipo

fun avaliacao(expressao: Expressao): Int {
    if (expressao is Numero) {
        return expressao.valor
    }

    if (expressao is Soma) {
        return avaliacao(expressao.direita) + avaliacao(expressao.esquerdo)
    }

    throw IllegalArgumentException("expressao invalida")
}

fun avaliacaoWhen(expressao: Expressao) =
    when (expressao) {
        is Numero -> {
            println("numero")
            expressao.valor
        }
        is Soma -> {
            println("soma")
            avaliacao(expressao.direita) + avaliacao(expressao.esquerdo)
        }
        else -> throw java.lang.IllegalArgumentException("nao e nada")
    }


fun check(tipo: Tipo): Any {
    if (tipo is Letra) return "letra"
    if (tipo is Digito) return "digito"
    throw java.lang.IllegalArgumentException("nao sei")
}

// ((1 + 2) + (4 + 5))
// (1 + 2) = a
// (4 + 5) = b
// (a + b) = c
fun main() {
    val a = Soma(Numero(1), Numero(2))
    val b = Soma(Numero(4), Numero(5))
    val c = Soma(a, b)
    val d = Soma(c, Numero(100))
    println(avaliacaoWhen(d))

//    val p = Digito(1)
//    val q = Letra("s")
//    println(check(p))
//    println(check(q))
}