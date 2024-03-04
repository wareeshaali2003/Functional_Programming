import scala.util.Random

object PrimeNumberMap {
  def main(args: Array[String]): Unit = {
    val random = new Random()
    var numbers = List[Int]()

    for (_ <- 1 to 15) {
      numbers = numbers :+ random.nextInt(451) + 50
    }
    println("Generated numbers: " + numbers)

    var primes = List[Int]()
    var primeMap = Map[Int, Int]()
    var index = 0

    for (num <- numbers) {
      if (isPrime(num)) {
        primes = primes :+ num
        primeMap += (index -> num)
      }
      index += 1
    }
    
    println("Prime numbers: " + primes)
    println("Prime number map: " + primeMap)
  }

  def isPrime(num: Int): Boolean = {
    if (num <= 1) return false
    for (i <- 2 until num) {
      if (num % i == 0) return false
    }
    true
  }
}
