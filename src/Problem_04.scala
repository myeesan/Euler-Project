object Problem_04 extends App {

  def isPalindrome(x: Int): Boolean =
    x.toString.reverse == x.toString // == is same as Java's equals
  // x.toString.reverse equals x.toString
  //  val xs = (100 to 999) flatMap (x => (100 to 999) map (y => (x, y)))
  val xs = for (x <- 100 to 999; y <- 100 to 999) yield (x, y)
  val palindromeSet = (xs.map { case (a, b) => a * b }).filter(isPalindrome(_)).toSet // remove duplicated res
  val sortedList = palindromeSet.toList.sortWith(_ > _)

  println(sortedList(0))
  println(palindromeSet.max)
}