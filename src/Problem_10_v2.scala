import scala.collection.mutable.BitSet

object Problem_10_v2 extends App {

  val max = 2000000
  val matrix = BitSet()
  var result = 0l;

  for (
    i <- 2 to max;
    j <- i to max by i
  ) {
    if (i != j || matrix.contains(i))
      matrix.add(j)
    else
      result += j
  }

  println(result)
}