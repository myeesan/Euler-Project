import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class Problem_13_Test extends FlatSpec with ShouldMatchers {

  "slice" should "list of rows -> list of cols" in {
    
    val init = List("123",
    				"456",
    				"789")

    val expect = List("147",
    				  "258",
    				  "369")

    import Problem_13.slice
    assert(init === slice(expect))
  }

  
  "intToDigit" should "convert num into charsArr" in {

    import Problem_13.intToDigit
    assert(List(1, 2, 3, 4, 5) === intToDigit(12345))
    assert(List(1, 2, 3, 4, 5) === 
      12345.toString.toCharArray.map(_.toString).toList.map(_.toInt))
  }
}