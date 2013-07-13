import scala.annotation.tailrec

object Problem_14 extends App {

  val nums = 1L to 1000000L

  @tailrec def calc(num: Long, acc: Int = 0): Int = {
    if (num == 1) acc
    else if (num % 2 == 0) calc(num / 2, acc + 1)
    else calc(num * 3 + 1, acc + 1)
  }
  val indexedValues = nums.map(calc(_)).zipWithIndex

  println(indexedValues.max._2 + 1)

}