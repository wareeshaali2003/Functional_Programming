object CharArrayGenerator {
  def main(args: Array[String]): Unit = {
    val startAscii = 'a'.toInt
    val charList = charArray(startAscii)
    println(charList)
  }

  def charArray(start: Int): List[Char] = {
    @annotation.tailrec
    def loop(current: Char, acc: List[Char]): List[Char] = {
      if (current > 'z') acc
      else loop((current.toInt + 1).toChar, acc :+ current)
    }

    loop(start.toChar, List.empty[Char])
  }
}
