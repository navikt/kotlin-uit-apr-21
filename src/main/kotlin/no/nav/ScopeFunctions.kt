package no.nav

import java.io.File

fun main() {
   with("whatever") {
      println("'$this' in uppercase is ${this.toUpperCase()}")
   }

   val messages = MessageBoard().apply {
      addMessage("stuff")
      addMessage("things")
   }
   println(messages.shoutEmOut())

   System.getProperty("java.io.tmpdir").let { tmpdir ->
      File("$tmpdir/myfile.txt").writer().use { writer ->
         writer.write("something")
      }.also {
         println("wrote file to folder '$tmpdir'")
      }
   }
}

class MessageBoard {
   private val msgs = mutableListOf<String>()

   fun addMessage(msg: String) = msgs.add(msg)

   fun shoutEmOut() = msgs.map { it.toUpperCase() }
}


