
object DemoRecursion { 

   def main(args: Array[String]) {
      print("Calculate the factorial of which number: " )
      val num = Console.readLine.toInt
      println( "Factorial " + num + "! = " + factorial(num) );

      print("Calculate how many Fibonacci numbers: " )
      val f_nums = Console.readLine.toInt
      var i = 0
      var n_1 = 0
      var n_2 = 1
      fibonacci(i, f_nums, n_1, n_2)
   }

   // Define factorial function
   def factorial(x: BigInt): BigInt =
     if (x == 0) 1 else x * factorial(x - 1)
  
   // Define fibonacci function
   def fibonacci(i: BigInt, x: BigInt, n_1: BigInt, n_2: BigInt): Unit = {

     var new_i, new_number: BigInt = 0
     var new_n_1: BigInt = n_1
     var new_n_2: BigInt = n_2

     if (i < x) {
       if (i == 0) {
           println(i + " = 0")
           new_i = i + 1
       }
       else
       if (i == 1) {
           println(i + " = 1")
           new_i = i + 1
       }
       else
       if (i >= 2) {
           new_number = n_1 + n_2
           println(i + " = " + new_number)
           new_i = i + 1
           new_n_1 = n_2
           new_n_2 = new_number
        }

        // Recursively call Fibonacci function
        fibonacci(new_i, x, new_n_1, new_n_2)
      }
    }
}
