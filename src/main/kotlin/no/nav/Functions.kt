package no.nav

fun main() {
   println(basicFunction())
   println(add(2, 3))
   println(doStuffWithNumbers(2, 3) { x, y -> x * y }) // lambda
   println(doStuffWithNumbers(2, 3, ::add))            // function reference
   println(adder()(2, 3))
   println(curriedAdder(2)(3)(4))
   println(multiplier(2, 3))
   withDefaultArg(first = "one")
   withDefaultArg(first = "one", second = "overridden")
}

fun basicFunction() = listOf("one", "two", "three")

fun add(x: Int, y: Int): Int = x + y

fun doStuffWithNumbers(x: Int, y: Int, operation: (Int, Int) -> Int)  = operation(x, y)

fun adder() = { x: Int, y: Int -> x + y }

fun curriedAdder(x: Int) = { y: Int -> { z: Int -> x + y + z } }

val multiplier = { x: Int, y: Int -> x * y }

fun withDefaultArg(first: String, second: String = "two") =
   println("$first $second")
