name          := "datasets"
organization  := "ohnosequences"
description   := ""

bucketSuffix  := "era7.com"

crossScalaVersions := Seq("2.11.11", "2.12.3")
scalaVersion  := crossScalaVersions.value.last

libraryDependencies ++= Seq(
  "ohnosequences" %% "cosas"           % "0.10.1",
  "ohnosequences" %% "aws-scala-tools" % "0.21.0",
  "org.scalatest" %% "scalatest"       % "3.0.4" % Test
)
