import scala.annotation.tailrec

// Streams dont need tail recursion : http://stackoverflow.com/questions/10525449/tail-recursive-bounded-stream-of-pairs-of-integers-scala
object Problem_07 extends App {
  def from(n: Int): Stream[Int] = n #:: from(n + 1)
  def sieve(s: Stream[Int]): Stream[Int] =
    s.head #:: sieve(s.tail.filterNot(_ % s.head == 0))

  println(sieve(from(2)).take(10001).last)
}