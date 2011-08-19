package de.scherf.scala

/**
 * User: scherf
 * Date: 17.08.11
 * Time: 16:07
 */

// Singleton object in this case also a companion object, because it's name is the same as the class name (Time)
object Time {

  def fromMinutes(minutes: Int): Time = {
    new Time(minutes / 60, minutes % 60)
  }

}

// class with parameter as default values
// specify parameter with named arguments new Time(minutes = 20)
// why remove vals?
case class Time (hours: Int = 0, minutes : Int = 0 ) {

  require(hours > -1, "hours need to be postive")
  require(minutes > -1, "hours need to be postive")

  // lazy initialization of the val
  lazy val asMinutes = minutes +60 * hours

  def minus (that : Time) : Int = {
    // val thisAsMinutes = minutes + 60 * hours
    // val thatAsMinutes = that.minutes +60 * that.minutes
    asMinutes - that.asMinutes
  }

  // operator notation
  def - (that: Time) : Int =  {
    minus(that)
  }

  def + (that: Time) : Int = {
    0
  }

  object Time {
    // classic way for a static method in java, which doesn't exists in scala
    def fromMinutes(minutes: Int): Time = {
      new Time( minutes / 60, minutes % 60)
    }

  }

}