object FSMApp {
  class FSM {
    var currentState: String = "Idle"

    def transition(event: String): Unit = {
      currentState match {
        case "Idle" =>
          if (event == "start") {
            println("Transition: Idle -> Active")
            currentState = "Active"
          }
        case "Active" =>
          if (event == "suspend") {
            println("Transition: Active -> Suspended")
            currentState = "Suspended"
          } else if (event == "terminate") {
            println("Transition: Active -> Terminated")
            currentState = "Terminated"
          }
        case "Suspended" =>
          if (event == "resume") {
            println("Transition: Suspended -> Active")
            currentState = "Active"
          } else if (event == "terminate") {
            println("Transition: Suspended -> Terminated")
            currentState = "Terminated"
          }
        case "Terminated" =>
          println("Cannot transition from Terminated state.")
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val fsm = new FSM()

    val transitions = Map(
      "start" -> "Active",
      "suspend" -> "Suspended",
      "resume" -> "Active",
      "terminate" -> "Terminated"
    )

    for (event <- List("start", "suspend", "resume", "terminate", "resume")) {
      val nextState = transitions.getOrElse(event, "Invalid event")
      println(s"Transition: ${fsm.currentState} -> $nextState")
      fsm.currentState = nextState
    }
  }
}
