package com.interview

object Triangle {

  sealed trait TriangleType
  case object EquilateralTriangle extends TriangleType
  case object IsoscelesTriangle  extends TriangleType
  case object ScaleneTriangle extends TriangleType

  sealed trait Exception extends Serializable with Product

  final case object InvalidTriangleType extends Exception

  def triangleType(side1Lenght: Int, side2Lenght: Int, side3Lenght: Int) =  {
    if(side1Lenght <= 0 || side2Lenght <= 0 || side3Lenght <= 0
         || side1Lenght + side2Lenght < side3Lenght
         || side2Lenght + side3Lenght < side1Lenght || side3Lenght + side1Lenght < side2Lenght) {
      InvalidTriangleType
    } else if(side1Lenght == side2Lenght && side2Lenght == side3Lenght) {
      EquilateralTriangle
    } else if(side1Lenght == side2Lenght || side2Lenght == side3Lenght || side3Lenght == side1Lenght) {
      IsoscelesTriangle
    } else {
      ScaleneTriangle
    }
  }

}
