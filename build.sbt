name := "ScalaTraining"

version := "1.0"

organization := "de.scherf.scala"

scalaVersion := "2.8.1"

libraryDependencies ++= Seq(
    "org.scala-tools.testing" %% "specs" % "1.6.7" % "test",
    "org.scala-tools.testing" %% "scalacheck" % "1.8" % "test"
)


// Add a single dependency
libraryDependencies += "org.mockito" % "mockito-all" % "1.8.5" % "test"

