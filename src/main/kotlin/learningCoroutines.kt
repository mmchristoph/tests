import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

suspend fun main() {
    semCoroutine()
    comCoroutine()
    comCoroutineNoMetodo()
}

suspend fun semCoroutine() {
    println("sem coroutine")
    val tempo = measureTimeMillis {
        val onze = onze()
        val dezoito = dezoito()
        println("a soma é ${onze + dezoito}")
    }
    println("o tempo foi $tempo ms\n")
}

suspend fun comCoroutine() = runBlocking {
    println("com coroutine")
    val tempo = measureTimeMillis {
        val onze = async(start = CoroutineStart.LAZY) { onze() }
        val dezoito = async(start = CoroutineStart.LAZY) { dezoito() }
        onze.start()
        dezoito.start()
        println("a soma é ${onze.await() + dezoito.await()}")
    }
    println("o tempo foi $tempo ms\n")
}

fun comCoroutineNoMetodo() {
    println("com coroutine no método")
    val tempo = measureTimeMillis {
        val onze = onzeCor()
        val dezoito = dezoitoCor()
        runBlocking {
            println("a soma é ${onze.await() + dezoito.await()}")
        }
    }
    println("o tempo foi $tempo ms\n")
}

suspend fun onze(): Int {
    delay(1000L)
    return 11
}

suspend fun dezoito(): Int {
    delay(1000L)
    return 18
}

@OptIn(DelicateCoroutinesApi::class)
fun onzeCor() = GlobalScope.async { onze() }

@OptIn(DelicateCoroutinesApi::class)
fun dezoitoCor() = GlobalScope.async { dezoito() }
