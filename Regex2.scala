
/*
You can make use of the mkString( ) method to concatenate the resulting list and you can use a pipe (|) to search small and capital case of Scala and you can use Regex constructor instead or r() method to create a pattern.

https://www.tutorialspoint.com/scala/scala_quick_guide.htm
*/

import scala.util.matching.Regex

object Regex2 { 
   def main(args: Array[String]) {
      val pattern = new Regex("(S|s)cala")
      val str = "Scala is scalable and cool"
      
      println((pattern findAllIn str).mkString(","))
   }
}

