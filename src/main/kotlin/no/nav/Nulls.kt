package no.nav

fun main() {
   val ordinaryString = "Hello!"
   println(ordinaryString)
   val possibleString: String? = null
   println(possibleString ?: "nothing to see here...")

   val navHQ = Building("NAV", null)
   println("${navHQ.name} is located at ${navHQ.address?.street ?: "unknown street"}")
}

class Building(val name: String, val address: PostalAddress?)
class PostalAddress(val street: String?)
