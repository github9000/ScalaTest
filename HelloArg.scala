
/*
Usage:
 scalac HelloArg.scala
 scala -classpath . HelloArg Ken
 Hello Ken
*/


object HelloArg extends App {

  if (args.length > 0)

    println(f"Hello ${args(0)}")

  else

    println("Hello, World!")

}

