object Problem_04 extends App {
  
  def isPalindrome(x: Int): Boolean =
    x.toString.reverse equals x.toString
  val xs = (100 to 999) flatMap (x => (100 to 999) map (y => (x, y)))
  val palindromeSet = (xs.map { case (a, b) => a * b }).filter(isPalindrome(_)).toSet // remove duplicated res
  val sortedList = palindromeSet.toList.sortWith(_ > _)
  
  println(sortedList(0))
}