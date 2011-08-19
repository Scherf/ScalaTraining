package de.scherf.scala

import org.specs.{ ScalaCheck, Specification }
import org.scalacheck.Gen._
import org.scalacheck.Prop._

/**
 * User: scherf
 * Date: 19.08.11
 * Time: 10:17
 */

class TimeSpec extends Specification with ScalaCheck {
  "Calling fromMinutes" should {

    "throw an IllegalArgumentException for negative minutes" in {
      forAll(choose(Int.MinValue, -1)) { (minutes: Int) =>
        Time fromMinutes minutes must throwA[IllegalArgumentException]
      } must pass
    }

    "return a correctly initialized Time instance for minutes within [0, 24 * 60 - 1)" in {
      forAll(choose(0, 24 * 60 - 1)) { (minutes: Int) =>

        val result = Time fromMinutes minutes
        result.hours mustEqual minutes / 60
        result.minutes mustEqual minutes % 60
      } must pass
    }
  }
}