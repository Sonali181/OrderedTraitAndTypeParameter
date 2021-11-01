package com.knoldus
import org.scalatest.flatspec.AnyFlatSpec

class TestCase extends AnyFlatSpec{
  var obj=new EmptySet[setValue]
  var obj1=new NonEmptySet[setValue](setValue(5),obj.incl(setValue(4)),obj.incl(setValue(1)))

  "Condition" should "include element in EmptySet using incl method" in {
    val st1= obj.incl(setValue(4)).incl(setValue(3))
    assert(st1.contains(setValue(4)))
  }
  "condition" should "check weather the element is present inthe set tree or not " in {
    val st2 = obj.incl(setValue(1)).incl(setValue(0)).incl(setValue(8)).incl(setValue(5))
    assert(st2.contains(setValue(0)))
    assert(!st2.contains(setValue(10)))
  }
  "condition" should "check weather non empty set has value 5 "in{
    assert(obj1.contains(setValue(5)))
  }

}
