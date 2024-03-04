object BuildMapExample {
  def main(args: Array[String]): Unit = {
    val lst = Array(1, 2, 3, 4, 5)

    def func(x: Int): Boolean = x % 2 == 0 // entry is even or not

    val result = buildMap(lst, func)
    println(result)
  }

  def buildMap[A, B](data: Seq[A], f: A => B): Map[B, A] = {
    var resultMap = Map[B, A]()
  
    
    var i = 0
    while (i < data.length) {
      val key = f(data(i)) // Apply the function to get the key
      resultMap += (key -> data(i)) // Add key-value pair to the map
      i += 1
    }
  
    resultMap
  }
}
