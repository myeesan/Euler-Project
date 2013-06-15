object exer_10 {
  def isTri(l: List[Int]) = l match { case (a :: b :: c :: Nil) => c * c == a * a + b * b }
                                                  //> isTri: (l: List[Int])Boolean
  // def isTri2(l: List[Int]) = if(l(2) * l(2) == l(0) * l(0) + l(1) * l(1)) true else false

  def ap(lim: Int): Stream[List[Int]] = for {
    a <- Stream.range(1, 1000);
    b <- Stream.range(1, lim - a);
    c = lim - a - b;
    if (c != 0)
  } yield List(a, b, c).sorted                    //> ap: (lim: Int)Stream[List[Int]]

  println(ap(1000).find(isTri).get.reduce(_ * _)) //> 31875000

}