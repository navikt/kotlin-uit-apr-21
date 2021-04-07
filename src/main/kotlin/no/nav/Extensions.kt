package no.nav

import java.math.BigDecimal

fun main() {
   println("uit".shout())
   println(25.dollars())
   println(4 isTwiceAsMuchAs 2)
}

fun String.shout() = "${this.toUpperCase()}!!!!!"

fun Int.dollars() = Currency("$", this.toBigDecimal())

infix fun Int.isTwiceAsMuchAs(other: Int) = this == other * 2

data class Currency(val name: String, val amount: BigDecimal)
