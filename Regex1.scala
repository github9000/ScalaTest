
/*
We create a String and call the r( ) method on it. Scala implicitly converts the String to a RichString and invokes that method to get an instance of Regex. To find a first match of the regular expression, simply call the findFirstIn() method. If instead of finding only the first occurrence we would like to find all occurrences of the matching word, we can use the findAllIn( ) method and in case there are multiple Scala words available in the target string, this will return a collection of all matching words.

https://www.tutorialspoint.com/scala/scala_quick_guide.htm

*/

import scala.util.matching.Regex

object Regex1 {
   def main(args: Array[String]) {
      val pattern = "Scala".r
      val str = "Scala is Scalable and cool"
      
      println(pattern findFirstIn str)
   }
}

