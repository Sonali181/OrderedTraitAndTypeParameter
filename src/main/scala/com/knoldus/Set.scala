package com.knoldus

trait Set[A <: Ordered[A]] {
  def incl(elemn: A): Set[A]
  def contains(value: A): Boolean
}
class EmptySet[A<:Ordered[A]] extends Set[A]{
  def incl(elemn: A): Set[A] =new NonEmptySet(elemn, new EmptySet[A], new EmptySet[A])
  def contains(value: A): Boolean =false
}
class NonEmptySet[A<:Ordered[A]](elem:A, left:Set[A], right:Set[A])extends Set[A] {
  def contains(value: A): Boolean = if (value < elem) left contains (value)
  else if (value > elem) right contains (value)
  else (value == elem)
  true

  def incl(elemn: A): Set[A] = {
    if (elemn < elem) new NonEmptySet(elem, left incl (elemn), right)
    else if (elemn > elem) new NonEmptySet(elem, left, right incl (elemn))
    else this
  }
}
case class setValue(element:Int) extends Ordered[setValue]{
  def compare(that: setValue): Int =
    if (this.element < that.element) -1
    else if (this.element > that.element) 1
    else 0
}
