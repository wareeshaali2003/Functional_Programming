object StringAdditionPrinter {
  def printStringAddition[T, U](input1: T, input2: U): Unit = {
    val result = input1.toString + input2.toString
    println(result)
  }

  def main(args: Array[String]): Unit = {
    printStringAddition(10, "20")
    printStringAddition("Hello, ", 2024)
  }
}
