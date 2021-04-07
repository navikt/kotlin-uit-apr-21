package no.nav

data class Product(val name: String, val weight: Double, val nrInStock: Int)

val inventory = listOf(
   Product("bread", 0.4, 16),
   Product("milk", 2.0, 12),
   Product("banana", 0.2, 33),
   Product("bag of rice", 20.5, 3),
   Product("columbian coffee", 2.2, 300),
   Product("egyptian coffee", 2.2, 300),
   Product("tea", 2.2, 21),
   Product("chocolate", 0.9, 0),
   Product("ice cream", 20.1, 0)
)

fun main() {
   println("heavy things: ${inventory.filter { it.weight > 10 }}")
   println("heaviest thing: ${inventory.maxByOrNull { it.weight }}")
   println("grouped by weight: ${inventory.associateBy { it.weight }}")
   println("how many types of coffee do we have?: ${inventory.count { it.name.contains("coffee") }}")
   println("avg weight of stuff heavier than 10: " +
      "${inventory.filter { it.weight > 10 }.map { it.weight }.average()}")
}
