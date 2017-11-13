
/*
Scala's exceptions work like exceptions in many other languages like Java. Instead of returning a value in the normal way, a method can terminate by throwing an exception. However, Scala doesn't actually have checked exceptions.

When you want to handle exceptions, you use a try{...}catch{...} block like you would in Java except that the catch block uses matching to identify and handle the exceptions.
*/

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

object Exceptions1 {
   def main(args: Array[String]) {
      try {
         val f = new FileReader("input.txt")
      } catch {
         case ex: FileNotFoundException =>{
            println("Missing file exception")
         }
         
         case ex: IOException => {
            println("IO Exception")
         }
      }
   }
}

