object Problem_12 extends App {
  
  def divide(num: Int, i: Int = 2): (Int, Int) = {
    if (num % i == 0) (num / i, i)
    else divide(num, i + 1)
  }
  
  def decomp(num: Int, l: List[Int] = Nil): List[Int] = {
    if (BigInt(num).isProbablePrime(16)) num :: l
    else {
      val res = divide(num)
      decomp(res._1, res._2 :: l)
    }
  }

  def calcDivisor(l: List[Int]): Int = {
    l.groupBy(x => x).map { case (x, exp: List[Int]) => exp.size + 1 }.product
  }

  def findTriElement(lim: Int, sum: Int = 3, inc: Int = 3): Int = {
    val divNum = calcDivisor(decomp(sum))
    if ((divNum >= lim)) sum
    else findTriElement(lim, sum + inc, inc + 1)
  }

  println(findTriElement(500))

}