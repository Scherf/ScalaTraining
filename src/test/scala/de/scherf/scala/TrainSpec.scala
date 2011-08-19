package de.scherf.scala

import org.specs.Specification
/**
 * User: scherf
 * Date: 19.08.11
 * Time: 09:54
 */

class TrainSpec extends Specification {

  "Creating a train" should {
    "throw an IllegalArgumentException for a null kind" in {
      new Train(null, "number") must throwA [IllegalArgumentException]
    }

    "throw an IllegalArgumentException for a null number" in {
      new Train("kind", null) must throwA [IllegalArgumentException]
    }


  }


}