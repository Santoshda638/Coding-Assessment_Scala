import com.interview.ListCompare.containsSameElements
import org.specs2.mutable._

class ListCompareSpec extends Specification {

  "ListCompare" should  {

    "compare two lists containing same elements and return true" in {
      val same =  containsSameElements(List(1, 2, 3), List(3, 1, 2))
      same must_===(true)
    }

    "compare two lists where one list contains fewer elements than other list and return false" in {
      val notSame =  containsSameElements(List(1, 2, 3), List(2, 1))
      notSame must_===(false)
    }

    "compare two lists containing different elements in both lists and return false " in {
      val notSame =  containsSameElements(List(1, 2, 3), List(7, 5,1))
      notSame must_===(false)
    }

    "compare two lists where  one list is empty, other is non-empty and return false as nothing to compare" in {
      val notSame =  containsSameElements(List(1, 2, 3), List())
      notSame must_===(false)
    }

    "compare two empty lists  and return true" in {
      val same =  containsSameElements(List(), List())
      same must_===(true)
    }
  }

}
