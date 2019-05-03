name          := "datasets"
organization  := "com.miodx.common"
version       := "0.5.1"
description   := ""

bucketSuffix  := "era7.com"

crossScalaVersions := Seq("2.11.11", "2.12.8")
scalaVersion  := crossScalaVersions.value.head

libraryDependencies ++= Seq(
  "com.miodx.common" %% "cosas"           % "0.10.1",
  "com.miodx.common" %% "aws-scala-tools" % "0.19.0",
  "org.scalatest"    %% "scalatest"       % "3.0.4" % Test
)
