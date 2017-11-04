
/*
 TO COMPILE
 scalac FrenchDate.scala

 TO RUN
 scala -classpath . FrenchDate

*/

// Display today's date in French.

// Also demos importing of Java classes into Scala

import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._

object FrenchDate {
  def main(args: Array[String]) {
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)
    println(df format now)
  }
}

