//
// :load /Users/kenw/ScalaTest/SmugNumbers.scala
//
// True: If number is a sum of two square numbers

val limit = 100

def isSmug(n : Int) : Boolean = {
  //val lst = List.range(1, math.sqrt(limit).toInt )
  val lst = List.range(1, limit )
  //println(lst)
  val sqr_nums = lst.map(x => x * x)
  //println(sqr_nums)
  val rem_nums = sqr_nums.map(x => n - x)
  //println(rem_nums)
  val rem_nums2 = rem_nums.filter(x => x < n)
  //println(rem_nums2)
  ((rem_nums2 intersect sqr_nums).length > 0)
}


/*
for each of the square numbers which you can get as n * n
subtract the number
see if the remainder is also a square number
you can stop if the remainder is less than the square number you subtracted
*/


var num: Int = 15
for (num <- 1 to 20) {
    println("isSmug " + num + " = " + isSmug(num))
}

