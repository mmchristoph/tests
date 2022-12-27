enum class Cor(val vermelho: Int, val verde: Int, val azul: Int) {
    VERMELHO(255, 0, 0),
    LARANJA(255, 165, 0),
    AMARELO(255, 255, 0),
    VERDE(0, 255, 0),
    AZUL(0, 0, 255);

    fun hello() = "hello"
    fun rgb() = ((vermelho * 256 + verde) * 256 + azul)
}

fun main() {
    println(Cor.AMARELO.hello())

    println(Cor.LARANJA.verde)
}

