package no.nav

fun main() {
   val immutableString: String = "hello"
   var mutableString = "hello again"
   //immutableString = "goodbye" // compiler error
   mutableString = "goodbye"

   val anInt = 2
   val aBoolean = false

   val immutableList = listOf(1, 2, 3)
   val mutableList = listOf(1, 2, 3).toMutableList()
   //immutableList.add(1) // compiler error
   mutableList.add(1)

   val a: UByte = 255u
}
