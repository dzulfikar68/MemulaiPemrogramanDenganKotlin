import kotlinx.coroutines.*

// TODO 1
fun sum(valueA: Int, valueB: Int): Int {
    return valueA+valueB
}

// TODO 2
fun multiple(valueA: Int, valueB: Int): Int {
    return valueA*valueB
}

fun main() = runBlocking {

    println("Counting...")

    val resultSum = async {
        delay(3000)
        sum(10, 10)
    }
    val resultMultiple = async {
        delay(2000)
        multiple(20, 20)
    }

    // TODO 3
    println("Result sum: "+resultSum.await())
    println("Result multiple: "+resultMultiple.await())
}