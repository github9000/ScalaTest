/*
https://www.tutorialspoint.com/scala/scala_quick_guide.htm


Value classes and Universal Traits
Value classes are new mechanism in Scala to avoid allocating runtime objects. It contains a primary constructor with exactly one val parameter. It contains only methods (def) not allowed var, val, nested classes, traits, or objects. Value class cannot be extended by another class. This can be possible by extending your value class with AnyVal. The typesafety of custom datatypes without the runtime overhead.

Let us take an examples of value classes Weight, Height, Email, Age, etc. For all these examples it is not required to allocate memory in the application.

A value class not allowed to extend traits. To permit value classes to extend traits, universal traits are introduced which extends for Any.
*/


trait Printable extends Any {
   def print(): Unit = println(this)
}
class Wrapper(val underlying: Int) extends AnyVal with Printable

object Demo {
   def main(args: Array[String]) {
      val w = new Wrapper(3)
      w.print() // actually requires instantiating a Wrapper instance
   }
}

