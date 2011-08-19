package de.scherf.scala


/**
 * User: scherf
 * Date: 17.08.11
 * Time: 15:52
 */

class Train (val kind : String, val number :String) {

  require(kind != null, "kind must not be null")
  require(number != null, "number must not be null")

}