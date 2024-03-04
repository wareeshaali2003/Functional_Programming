object FunctionalProgramming {
  def main(args: Array[String]): Unit = {
    val array1 = Array(1.0, 2.0, 3.0)
    val array2 = Array(4.0, 5.0, 6.0)

    val sumArray = elementwiseSum(array1, array2)
    println(sumArray.mkString(", "))
  }

  def elementwiseSum(arr1: Array[Double], arr2: Array[Double]): Array[Double] = {
    if (arr1.length != arr2.length) {
    
    }

    val result = new Array[Double](arr1.length)

    var i = 0
    while (i < arr1.length) {
      result(i) = arr1(i) + arr2(i)
      i += 1
    }

    result
  }
}
