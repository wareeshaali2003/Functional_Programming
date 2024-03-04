object main {
  var myArray:Array[String] = new Array[String](1)
  var myArray1 = new Array[String](1)
  var myArray2 = Array("wareesha", "hamna", "owais")
  def main(args: Array[String]): Unit = {
    myArray(0) =  "Hello";
    myArray1(0) =  "World"
    println(myArray(0))
    println( myArray1(0))
    for ( x <- myArray2 ) 
         println( x )
  }
}