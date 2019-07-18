import com.interview.Triangle.triangleType
import org.specs2.mutable._
import com.interview.Triangle.InvalidTriangleType
import com.interview.Triangle._


class TriangleSpec extends Specification {

  "Given Triangle " should {

    "be of type Isosceles " in {
      val typeOfTriangle = triangleType(3, 3 , 5)
      typeOfTriangle.toString.must_===(IsoscelesTriangle.toString)

    }

    "be of type Scalene " in {
      val typeOfTriangle = triangleType(3, 8 , 5)
      typeOfTriangle.toString.must_===(ScaleneTriangle.toString)

    }

    "be of type Equilateral " in {
      val typeOfTriangle = triangleType(3, 3 , 3)
      typeOfTriangle.toString.must_===(EquilateralTriangle.toString)

    }

    "throw not a valid triangle exception as one of the vertex is negative" in {
      val typeOfTriangle = triangleType(-3, 3 , 3)
      typeOfTriangle.toString.must_===(InvalidTriangleType.toString)

    }

    "throw not a valid triangle exception as sum of two vertices smaller than third" in {
      val typeOfTriangle = triangleType(3, 5 , 20)
      typeOfTriangle.toString.must_===(InvalidTriangleType.toString)

    }


  }

}
