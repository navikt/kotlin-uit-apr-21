package no.nav

import kotlin.random.Random

fun main() {
   repeat(5) {
      when (val lookupResult = doLookup()) {
         is Success -> println("Success! Found thing '${lookupResult.thing}'")
         is Failure -> println("Failure: ${lookupResult.errMsg}")
      }
   }
}

fun doLookup(): LookupResult =
   if (Random.nextInt() % 2 == 0) Success(ThingFromDatabase("whatever"))
   else Failure("oh noes!")

sealed class LookupResult

class Success(val thing: ThingFromDatabase) : LookupResult()

class Failure(val errMsg: String): LookupResult()

data class ThingFromDatabase(val theValue: String)
