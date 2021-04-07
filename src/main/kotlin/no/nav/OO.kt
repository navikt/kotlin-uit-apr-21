package no.nav

fun main() {
   val address = KotlinAddress("Storgata", 22)
   val per = KotlinPerson("Per", address)
   per.printMe()
   val otherPersonAtSameAddress = per.copy(name = "NotPer")
   otherPersonAtSameAddress.printMe()
   Circle().draw()

   val driveables = listOf(Car(), Bike())
   driveables.forEach { it.drive() }
}

class RegularClass(val member: String)

data class KotlinPerson(private val name: String, private val address: KotlinAddress) {
   fun printMe() = println("$name lives at $address")
}

data class KotlinAddress(val street: String, val houseNumber: Int)

open class Shape(name: String) {

   init {
       println("initialising $name")
   }

   open fun draw() {}
}

class Circle: Shape("circle") {
   override fun draw() {
      println("drawing circle")
   }
}

interface Driveable {
   fun drive()
}

class Car: Driveable {
   override fun drive() {
      println("driving car")
   }
}

class Bike: Driveable {
   override fun drive() {
      println("driving bike")
   }
}
