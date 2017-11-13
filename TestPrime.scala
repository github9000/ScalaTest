/*
  scalac TestPrime.scala
  scala -classpath . TestPrime
*/

object TestPrime {

  val limit = 20

  def isPrime1(n: Int): Boolean = ! ((2 until n-1) exists (n % _ == 0))

  def isPrime2(n: Int): Boolean = {
    if (n < 2) return false
    if (n == 2) return true
    if (n % 2 == 0) false
    else (3 until n by 2) forall (n % _ != 0)
  }

  def isPrime3(n: Int): Boolean = {
    if (n < 2) return false
    if (n == 2) return true
    if (n % 2 == 0) return false
    var i = 3
    while (i * i <= n) {
      if (n % i == 0) return false
      i += 2
    }
    true
  }

  def main(args: Array[String]) {
    println("Starting...!")
    
    for( n <- 1 to limit){
        println("The number " + n + " is prime = "  
                + isPrime1(n) + " , " + isPrime2(n) + " , " + isPrime3(n) )
    }

  }
}

