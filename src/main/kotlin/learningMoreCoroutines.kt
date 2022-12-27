import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    val time = measureTimeMillis {
        println("The answer is ${concurrentSum()}")
    }
    println("Completed in $time ms")

}

suspend fun concurrentSum(): Int = coroutineScope {
    val one = async { doSomethingUsefulAny(13) }
    val two = async { doSomethingUsefulAny(29) }
    val sum = listOf(one, two)
    println(sum::class)

    sum[0].await()+ sum[1].await()
}

suspend fun doSomethingUsefulOne(): Int {
    delay(1000L) // pretend we are doing something useful here
    return 13
}

suspend fun doSomethingUsefulTwo(): Int {
    delay(1000L) // pretend we are doing something useful here, too
    return 29
}

suspend fun doSomethingUsefulAny(n: Int): Int {
    delay(1000L) // pretend we are doing something useful here, too
    return n
}

@OptIn(DelicateCoroutinesApi::class)
fun doSomethingUsefulAnyCor(n: Int) = GlobalScope.async { doSomethingUsefulAny(n) }