object options {
  def main(args: Array[String]): Unit = {
    val lst:List[Int] =  List(1,2,3,4,4,5,6,6)
    println(lst.find (_ > 7));
    println(lst.find (_ > 3));
   
  }
}