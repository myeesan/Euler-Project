import scala.annotation.tailrec

object Problem_07 extends App {
  def from(n: Int): Stream[Int] = n #:: from(n + 1)
  def sieve(s: Stream[Int]): Stream[Int] =
    s.head #:: sieve(s.tail.filter(_ % s.head != 0))

  println(sieve(from(2)).take(10001).last)
}