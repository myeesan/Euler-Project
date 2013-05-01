import scala.annotation.tailrec

// http://euler.synap.co.kr/prob_detail.php?id=3
object Problem_03 extends App {

  def largestPrimeFactor(x: Long) = {
    require(x > 1L)
    @tailrec
    def nextPrime(t: Long, d: Long): Long = {
      if (t == d) d
      else if (t % d == 0) nextPrime(t / d, d)
      else nextPrime(t, d + 1)
    }
    nextPrime(x, 2)
  }

  //  println(largestPrimeFactor(1))
  println(largestPrimeFactor(600851475143L))
  println(largestPrimeFactor(12352312353L))
  println(largestPrimeFactor(3235231235323653616L))
}