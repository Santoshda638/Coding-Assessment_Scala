import com.interview.LinkedList.nthElementFromEndOfList
import org.specs2.mutable._

class LinkedListSpec extends Specification {

  "LinkedList" should  {

    "return the  4th  Element(7) from the end of the list" in {
      val nthElem = nthElementFromEndOfList(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 4)
      nthElem must_===(Some(7))
    }

    "return None as list is empty" in {
      val nthElem = nthElementFromEndOfList(List(), 4)
      nthElem must_===(None)
    }

    "return None as nth element is given as negative index" in {
      val nthElem = nthElementFromEndOfList(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), -4)
      nthElem must_===(None)
    }

    "return None as list size is smaller to nth element" in {
      val nthElem = nthElementFromEndOfList(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 100)
      nthElem must_===(None)
    }
  }


}
