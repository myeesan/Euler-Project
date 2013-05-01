import scala.annotation.tailrec

// http://euler.synap.co.kr/prob_detail.php?id=3
object Problem_03 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(335); 

  def largestPrimeFactor(x: Long): Long = {
    @tailrec
    def nextPrime(x: Long, y: Long): Long = {
      if (x == y) y
      else if (x % y == 0) nextPrime(x / y, y)
      else nextPrime(x, y + 1)
    }
    nextPrime(x, 2)
  };System.out.println("""largestPrimeFactor: (x: Long)Long""");$skip(36); val res$0 = 
  largestPrimeFactor(600851475143L);System.out.println("""res0: Long = """ + $show(res$0))}
}
