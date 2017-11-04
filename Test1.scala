
/*
 scalac Test1.scala
 scala -classpath . Test1

*/

import scala.collection.mutable.ArrayBuffer


class Counter {

  private var value = 0 // You must initialize the field

  def increment() { value += 1 } // Methods are public by default

  def current() = value

}

class Class1 {


}

class Person(val name: String) {

  var age = 0

  def description = s"$name is $age years old"

}


object Test1 {

  def main(args: Array[String]) {

    val b = ArrayBuffer[Int]()

    // Or new ArrayBuffer[Int]
    // An empty array buffer, ready to hold integers

    b += 1

    // ArrayBuffer(1)
    // Add an element at the end with +=

    b += (1, 2, 3, 5)

    // ArrayBuffer(1, 1, 2, 3, 5)
    // Add multiple elements at the end by enclosing them in parentheses

    b ++= Array(8, 13, 21)

    // ArrayBuffer(1, 1, 2, 3, 5, 8, 13, 21)
    // You can append any collection with the ++= operator

    b.trimEnd(5)

    // ArrayBuffer(1, 1, 2)
    // Removes the last five elements

    println(b)

    val c1 = new Class1()

    val myCounter = new Counter // Or new Counter()
    myCounter.increment()
    println(myCounter.current)

    val ken = new Person("Ken")
    ken.age = 21
    println(ken.description)


  }
}



