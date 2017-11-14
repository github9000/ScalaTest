
=============================================================================

SYNTAX EXAMPLES
https://www.tutorialspoint.com/scala/scala_for_loop.htm

=============================================================================

Kens-MacBook-Pro:scala_tests kenw$ scala
Welcome to Scala 2.12.3 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_51).

Type in expressions for evaluation. Or try :help.

scala> :help
All commands can be abbreviated, e.g., :he instead of :help.
:edit <id>|<line>        edit history
:help [command]          print this summary or command-specific help
:history [num]           show the history (optional num is commands to show)
:h? <string>             search the history
:imports [name name ...] show import history, identifying sources of names
:implicits [-v]          show the implicits in scope
:javap <path|class>      disassemble a file or class name
:line <id>|<line>        place line(s) at the end of history
:load <path>             interpret lines in a file
:paste [-raw] [path]     enter paste mode or paste a file
:power                   enable power user mode
:quit                    exit the interpreter
:replay [options]        reset the repl and replay all previous commands
:require <path>          add a jar to the classpath
:reset [options]         reset the repl to its initial state, forgetting all session entries
:save <path>             save replayable session to a file
:sh <command line>       run a shell command (result is implicitly => List[String])
:settings <options>      update compiler options, if possible; see reset
:silent                  disable/enable automatic printing of results
:type [-v] <expr>        display the type of an expression without evaluating it
:kind [-v] <type>        display the kind of a type. see also :help kind
:warnings                show the suppressed warnings from the most recent line which had any

scala> :q
Kens-MacBook-Pro:scala_tests kenw$

=============================================================================

"Programming in Scala, Third Edition" web-site, source-code and errata.
https://booksites.artima.com/programming_in_scala_3ed
Source-code
https://booksites.artima.com/programming_in_scala_3ed/examples/


SCALA language main web-site
https://www.scala-lang.org/documentation/getting-started.html

=============================================================================

http://docs.scala-lang.org/getting-started-sbt-track/getting-started-with-scala-and-sbt-on-the-command-line.html

  sbt new scala/hello-world.g8
  cd hello-world
  sbt> :help 
  sbt> run

=============================================================================

SCALA and INTELLIJ

http://docs.scala-lang.org/getting-started-intellij-track/getting-started-with-scala-in-intellij.html

=============================================================================

SCALAC

HelloWorld.scala

object HelloWorld {
  def main(args: Array[String]) {
    println("Hello, world!")
  }
}

TO COMPILE
> scalac HelloWorld.scala

TO RUN
> scala -classpath . HelloWorld

=============================================================================




