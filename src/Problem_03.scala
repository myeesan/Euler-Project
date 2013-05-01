import scala.annotation.tailrec

// http://euler.synap.co.kr/prob_detail.php?id=3
object Problem_03 extends App{

  def largestPrimeFactor(x: Long): Long = {
    @tailrec
    def nextPrime(x: Long, y: Long): Long = {
      if (x == y) y
      else if (x % y == 0) nextPrime(x / y, y)
      else nextPrime(x, y + 1)
    }
    nextPrime(x, 2)
  }
  
  println(largestPrimeFactor(600851475143L))
}