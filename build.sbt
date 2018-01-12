name := "scala-modbus-starter-kit"

version := "0.1"

scalaVersion := "2.12.4"

libraryDependencies ++=
  Seq(
    "net.wimpi" % "jamod" % "1.2",
    "com.typesafe" % "config" % "1.3.1",
    "org.scalatest" %% "scalatest" % "3.0.0" % Test
  )
