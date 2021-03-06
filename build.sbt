name := "webfontloader.scala.js"
organization := "com.outr"
version := "1.6.28_2"

scalaVersion := "2.13.1"
crossScalaVersions := List("2.13.1", "2.12.8", "2.11.12")

enablePlugins(ScalaJSPlugin)
enablePlugins(JSDependenciesPlugin)

jsDependencies += ProvidedJS / "webfontloader.js"
skip in packageJSDependencies := false

publishTo in ThisBuild := sonatypePublishTo.value
sonatypeProfileName in ThisBuild := "com.outr"
publishMavenStyle in ThisBuild := true
licenses in ThisBuild := Seq("MIT" -> url("https://github.com/outr/webfontloader.js/blob/master/LICENSE"))
sonatypeProjectHosting in ThisBuild := Some(xerial.sbt.Sonatype.GitHubHosting("outr", "webfontloader.js", "matt@outr.com"))
homepage in ThisBuild := Some(url("https://github.com/outr/webfontloader.js"))
scmInfo in ThisBuild := Some(
  ScmInfo(
    url("https://github.com/outr/webfontloader.js"),
    "scm:git@github.com:outr/webfontloader.js.git"
  )
)
developers in ThisBuild := List(
  Developer(id="darkfrog", name="Matt Hicks", email="matt@matthicks.com", url=url("http://matthicks.com"))
)