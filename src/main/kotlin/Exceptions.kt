import java.io.BufferedReader
import java.io.FileReader

fun percent(num: Int): Int {
    return if (num in 0..100) {
        num
    } else {
        throw IllegalArgumentException("o numero dever esta de 0 a 100")
    }
}

fun lerIdade() {
    val file = FileReader("src/main/kotlin/idade")
    val buffer = BufferedReader(file)

    try {
        buffer.forEachLine {
            println(Integer.parseInt(it))
            println(percent(Integer.parseInt(it)))
        }
    } catch (e: NumberFormatException) {
        println(e.message)
    } catch (e: Exception) {
        println(e.message)
    } finally {
        println("fechando arquivo")
        buffer.close()
    }
}

fun main() {

    lerIdade()

}