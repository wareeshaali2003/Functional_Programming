object EuclideanNorm {
  def main(args: Array[String]): Unit = {
    
    val vector = List(3, 4)

    
    var sumOfSquares = 0
    for (x <- vector) {
      sumOfSquares += x * x
    }
    val norm = math.sqrt(sumOfSquares)

   
    println( + norm)
  }
}
