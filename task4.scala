object CountEvenNumbers {
  def main(args: Array[String]): Unit = {

    val array = Array.fill(100)(scala.util.Random.nextInt(100))

   
    val count1 = countEvenWithLoop(array)
    println(s"Method 1: Number of even numbers (loop): $count1")

  
    val count2 = countEvenWithRecursion(array)
    println(s"Method 2: Number of even numbers (recursion): $count2")
  }

  
  def countEvenWithLoop(arr: Array[Int]): Int = {
    var count = 0
    var i = 0
    while (i < arr.length) {
      if (arr(i) % 2 == 0) {
        count += 1
      }
      i += 1
    }
    count
  }

 
  def countEvenWithRecursion(arr: Array[Int]): Int = {
    def loop(index: Int, count: Int): Int = {
      if (index >= arr.length) count
      else if (arr(index) % 2 == 0) loop(index + 1, count + 1)
      else loop(index + 1, count)
    }

    loop(0, 0)
  }
}
