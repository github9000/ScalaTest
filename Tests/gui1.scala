
/*
    http://otfried.org/scala/index_28.html

    USAGE:
    > fsc gui1.scala 
    > scala GuiProgramOne
    End of main function
    
*/

import scala.swing._

class UI extends MainFrame {
  title = "GUI Program #1"
  preferredSize = new Dimension(320, 240)
  contents = new Label("Here is the contents!")
}

object GuiProgramOne {
  def main(args: Array[String]) {
    val ui = new UI
    ui.visible = true
    println("End of main function")
  }
}


