object sets {
  def main(args: Array[String]): Unit = {
    var myset:Set[Int] =  Set(1,2,3,4,4,5,6,6)
    var mymap:Map[Int,String] =  Map(1 -> "wareesha",2 -> "hamna",3 -> "owais")
    mymap += (7->"ali")
    println(mymap)
   
  }
}