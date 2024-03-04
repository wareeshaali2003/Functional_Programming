object collection {
  def example1(): Unit = {
    val numbers = List(1, 2, 3, 4, 5)
    val doubledNumbers = numbers.map(_ * 2)
    println(s"Doubled numbers: $doubledNumbers")

    def squareIfGreaterThanTwo(x: Int): Option[Int] = if (x > 2) Some(x * x) else None

    val squaredNumbers = numbers.map(squareIfGreaterThanTwo)
    println(s"Squared numbers (if greater than 2): $squaredNumbers")
  }

  def example2(): Unit = {
    val numbers: List[Int] = List(1, 2, 3, 4, 5)

    def extendList(v: Int): List[Int] = List(v - 1, v, v + 1)

    val extendedList = numbers.map(extendList)
    println(s"Extended list using map: $extendedList")

    val flattenedList = numbers.flatMap(extendList)
    println(s"Extended list using flatMap: $flattenedList")
  }

  def example3(): Unit = {
    val numbers = List(1, 2, 3, 4, 5)

    def filterGreaterThanTwo(x: Int): Option[Int] = if (x > 2) Some(x) else None

    val filteredNumbers = numbers.map(filterGreaterThanTwo)
    println(s"Filtered numbers: $filteredNumbers")

    val flattenedFilteredNumbers = numbers.flatMap(filterGreaterThanTwo)
    println(s"Flattened filtered numbers: $flattenedFilteredNumbers")
  }

def example4(): Unit = {
  val charMap = Map('a' -> 2, 'b' -> 4, 'c' -> 6)

  val doubledValuesMap = charMap.view.toMap.mapValues(_ * 2)
  println(s"Doubled values map: $doubledValuesMap")

  def doubleKeyValue(k: Char, v: Int): Option[(Char, Int)] = Some(k -> (v * 2))

  val doubledKeyValueMap = charMap.map { case (k, v) => doubleKeyValue(k, v) }
  println(s"Doubled key-value map: $doubledKeyValueMap")

  val flattenedDoubledKeyValueMap = charMap.flatMap { case (k, v) => doubleKeyValue(k, v) }
  println(s"Flattened doubled key-value map: $flattenedDoubledKeyValueMap")
}

  def main(args: Array[String]): Unit = {
    example1()
    example2()
    example3()
    example4()
  }
}
