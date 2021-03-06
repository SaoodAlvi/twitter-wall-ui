enablePlugins(ScalaJSPlugin, WorkbenchPlugin)

name := "twitter-wall-ui"

version := "0.1-SNAPSHOT"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "com.lihaoyi" %%% "scalatags" % "0.6.7",
  "io.monix" %%% "monix" % "3.0.0-RC1"
)
