package com.interview
import scala.collection.mutable.Stack

object LinkedList {

  def nthElementFromEndOfList[A](inputList: List[A], nthElem: Int): Option[A] = {

    if(inputList.isEmpty || nthElem < 0 || inputList.length < nthElem) {
      return None
    }

    val stack = Stack[A]()
    stack.pushAll(inputList)

    def loop(n : Int): Option[A] = {
      if(n == 1) {
      Some(stack.pop())
      }
      else {
        stack.pop()
        loop(n-1)
      }
    }
    loop(nthElem)
  }

}