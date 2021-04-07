package no.nav

fun main() {
    val basicString = "hello!"
    val rawString = """
        I'm on multiple lines.
        Cool, right?
    """.trimIndent()
    val number = 2
    val templateString = "The number is $number. Oh, and I also do expressions: ${basicString.toUpperCase()}"
    println(rawString)
    println(templateString)
}
