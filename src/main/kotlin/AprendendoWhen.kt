fun fraseLegal(cor: Cor) =
    when (cor) {
        Cor.VERMELHO -> "ver"
        Cor.AMARELO -> "alguem"
        Cor.VERDE -> "viver"
        Cor.AZUL -> "alem"
        Cor.LARANJA -> "legal"
    }

fun qualTemperatura(cor: Cor): String {
    return when (cor) {
        Cor.VERMELHO, Cor.LARANJA, Cor.AMARELO -> "quente"
        Cor.VERDE -> "neutra"
        Cor.AZUL -> "fria"
    }
}

fun ifExpressao(cor: Cor) =
    if (cor == Cor.AMARELO) 1 else "errado"

fun ifExpressaoBloco(cor: Cor): Any {
    return if (cor == Cor.AMARELO) "q" else "2"
}

fun main() {
    val obterPalavra = fraseLegal(Cor.VERDE)
    println(obterPalavra)

    val temperatura = qualTemperatura(Cor.AMARELO)
    println(temperatura)

    val corBrasil = ifExpressao(Cor.VERMELHO)
    println(corBrasil)

    val corBrasilBloco = ifExpressaoBloco(Cor.VERMELHO)
    println(corBrasilBloco)
}