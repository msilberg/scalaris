name := "scalaris"

version := "1.1.1"

scalaVersion := "2.11.8"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"

lazy val env = taskKey[Unit]("Development")