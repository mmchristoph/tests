class Retangulo {
    var altura: Int = 0
        set(value) {
            field = value
        }
    var largura: Int = 0

    val isQuadradoEstranho: Boolean
        get() {
            return altura == largura
        }

    fun isQuadrado() = altura == largura
}

fun main() {
    val g = Retangulo()
    g.largura = 1
    g.altura = 2
    println(g.isQuadrado())
    println(g.isQuadradoEstranho)
}