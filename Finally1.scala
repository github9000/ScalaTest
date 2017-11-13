
/*
The finally Clause
You can wrap an expression with a finally clause if you want to cause some code to execute no matter how the expression terminates. Try the following program.
*/


import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

object Demo {
   def main(args: Array[String]) {
      try {
         val f = new FileReader("input.txt")
      } catch {
         case ex: FileNotFoundException => {
            println("Missing file exception")
         }
         
         case ex: IOException => {
            println("IO Exception")
         }
      } finally {
         println("Exiting finally...")
      }
   }
}


