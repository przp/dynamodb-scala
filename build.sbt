name := "dynamodb-scala"

version := "0.2.0"

scalaVersion := "2.11.7"

organization := "com.onzo"

lazy val compilerOptions = Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-unchecked",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Xfuture"
)

resolvers += "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

resolvers += Resolver.bintrayRepo("dwhjames", "maven")
libraryDependencies += "com.github.dwhjames" %% "aws-wrap" % "0.8.0"
libraryDependencies += "com.amazonaws" % "aws-java-sdk-dynamodb" % "1.10.34" % "provided"

lazy val catsVersion = "0.3.0"

libraryDependencies ++= Seq(
  "org.spire-math" %% "cats-core" % catsVersion,
  "com.chuusai" %% "shapeless" % "2.3.0-SNAPSHOT",
  "org.scalacheck" %% "scalacheck" % "1.12.5" % "test",
  "org.scalatest" %% "scalatest" % "3.0.0-M9" % "test",
  "org.spire-math" %% "cats-laws" % catsVersion % "test",
  "org.typelevel" %% "discipline" % "0.4" % "test",
  "joda-time" % "joda-time" % "2.9" % "test",
  "org.joda"  % "joda-convert" % "1.8" % "test"
)
// Bintray:

licenses +=("Apache-2.0", url("http://apache.org/licenses/LICENSE-2.0"))

bintrayPackageLabels in bintray := Seq("scala", "dynamo", "dynamodb", "amazon", "utility")

bintrayRepository in bintray := "maven"
