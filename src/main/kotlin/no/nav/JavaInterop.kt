package no.nav

fun main() {
   val kotlinPerson = KotlinPerson("Max Mekker", KotlinAddress("gata", 42))
   val javaPerson = JavaPerson("Leonora Dorothea Dahl", JavaAddress("stien", 55))

   println(kotlinPerson)
   println(javaPerson)
}
