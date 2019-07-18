name := "scala_coding_Assignment"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "4.3.4")
libraryDependencies ++= Seq("org.specs2" %% "specs2-scalacheck" % "4.3.4")

scalacOptions in Test ++= Seq("-Yrangepos")