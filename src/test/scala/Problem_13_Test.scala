import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class Problem_13_Test extends FlatSpec with ShouldMatchers {

  import Problem_13.slice
  "slice" should "list of rows -> list of cols" in {

    val init = List(
      "123",
      "456",
      "789")

    val expect = List(
      "147",
      "258",
      "369")

    slice(init) should be(expect)
  }

  import Problem_13.intToDigit
  "intToDigit" should "convert num into charsArr" in {

    intToDigit(12345) should be(List(1, 2, 3, 4, 5))

    val digitListByCharArray = 12345.toString.toCharArray.map(_.toString).toList.map(_.toInt)
    digitListByCharArray should be(List(1, 2, 3, 4, 5))
  }
}