
/*
Pattern Matching with Extractors

When an instance of a class is followed by parentheses with a list of zero or more parameters, the compiler invokes the apply method on that instance. We can define apply both in objects and in classes.

As mentioned above, the purpose of the unapply method is to extract a specific value we are looking for. It does the opposite operation apply does. When comparing an extractor object using the match statement the unapply method will be automatically executed.

Desn't entirely work...??
Kens-MBP:ScalaTest kenw$ scalac Extractors2.scala
Kens-MBP:ScalaTest kenw$ scala Extractors2.scala
*/

object Extractors2 {

   def main(args: Array[String]) {
      val x = Extractors2(5)
      println(x)

      x match {
         case Extractors2(num) => println(x+" is bigger two times than "+num)
         
         //unapply is invoked
         case _ => println("i cannot calculate")
      }
   }
   def apply(x: Int) = x*2
   def unapply(z: Int): Option[Int] = if (z%2==0) Some(z/2) else None
}

