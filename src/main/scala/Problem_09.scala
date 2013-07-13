object Problem_09 extends App {
  
//  def isTri2(l: List[Int]) = if(l(2) * l(2) == l(0) * l(0) + l(1) * l(1)) true else false
  def isTri(l: List[Int]) = l match { case (a :: b :: c :: Nil) => c * c == a * a + b * b }
  
  def ap(lim: Int): Stream[List[Int]] = for {
    a <- Stream.range(1, 1000);
    b <- Stream.range(1, lim - a);
    c = lim - a - b;
    if (c != 0)
  } yield List(a, b, c).sorted

  val result = ap(1000).find(isTri).get.reduce(_ * _) 
  
  println(result)
}