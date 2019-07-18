package com.interview

object ListCompare {

  def containsSameElements[A](list1: List[A], list2: List[A]) (implicit order: Ordering[A]) : Boolean = {

    def recursion(list1: List[A], list2: List[A]): Boolean = {
      (list1, list2) match {
        case( x :: xs,  y :: ys) => if(x == y) {
          recursion(xs, ys)
        } else {
          false
        }
        case(Nil, Nil) => true
        case _ => false
      }
    }
    recursion(list1.sorted, list2.sorted)
  }

}
