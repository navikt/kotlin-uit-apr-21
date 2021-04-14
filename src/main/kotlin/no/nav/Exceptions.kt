package no.nav

import java.lang.Exception
import java.lang.RuntimeException
import java.util.*

fun mayGoHorriblyWrong() =
   if (Random().nextInt(1000) % 2 == 0) throw RuntimeException("oh noes!") else 42

fun yolo() = println(mayGoHorriblyWrong())

fun tryCatch() = try {
    println("Fikk ${mayGoHorriblyWrong()}")
} catch (ex: Exception) {
   println("catcha en ($ex)")
}

fun functionalStyle() = runCatching { mayGoHorriblyWrong() } // still experimental (may change)

fun main() {
   tryCatch()
   functionalStyle()
      .map { it  * 2 }
      .onSuccess { println("Dobla resultatet til: $it") }
      .onFailure { println("Det tryna jo hardt: $it") }
   yolo()
}
