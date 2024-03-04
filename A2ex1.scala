object QuadraticFunction {
  def main(args: Array[String]): Unit = {
    val a = 3
    val b = 5
    val c = 7

    def quadraticFunction(x: Int): Int = {
      a * x * x + b * x + c
    }

    val inputList = List.range(-3, 4)

    val mappedList = inputList.map(quadraticFunction)

    println("Mapped List: " + mappedList)
  }
}
