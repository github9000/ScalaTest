

/*
If you would like to replace matching text, we can use replaceFirstIn( ) to replace the first match or replaceAllIn( ) to replace all occurrences.
*/

object  Replace1 {
   def main(args: Array[String]) {
      val pattern = "(S|s)cala".r
      val str = "Scala is scalable and cool"
      
      println(pattern replaceFirstIn(str, "Java"))
   }
}

