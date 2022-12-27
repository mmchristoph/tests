fun main() {
    var temperatura: Int
    var somatoria = 0
    var quantidade = 0
    var media: Int

    do {
        println("digite a temperatura:")
        temperatura = readln().toInt()
        somatoria += temperatura
        quantidade++
        media = somatoria / quantidade
        println("media = $media")
    } while (temperatura != 999)
}