object list_print{
  class ListPrinter {
    def apply(list: List[Any]): Unit = {
      println(list)
    }
  }

  object ListPrinter {
    def apply(list: List[Any]): Unit = {
      println(list)
    }
  }

  def main(args: Array[String]): Unit = {
    val myList = List(1, 2, 3, 4, 5)
    
    val printer1 = new ListPrinter()
    printer1(myList)

    ListPrinter(myList)
  }
}