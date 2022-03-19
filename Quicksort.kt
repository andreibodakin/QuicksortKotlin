package quicksortkotlin

import java.util.*

fun main() {
    var result = Quicksort()

    println("Hello Kotlin!")
    println(Arrays.toString(result.sortArray))
}

class Quicksort {
    var one = ArrayGenerator()

    var sortArray = one.intArray
}