name := """java-play-angular-seed"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava).settings(
  watchSources ++= (baseDirectory.value / "ui/src" ** "*").get
)

scalaVersion := "2.13.14"

libraryDependencies += guice
dependencyOverrides += "org.scala-lang.modules" %% "scala-xml" % "2.2.0"

// Test Database
libraryDependencies += "com.h2database" % "h2" % "2.2.224"

// Testing libraries for dealing with CompletionStage...
libraryDependencies += "org.assertj" % "assertj-core" % "3.25.3" % Test
libraryDependencies += "org.awaitility" % "awaitility" % "4.2.1" % Test
libraryDependencies += "junit" % "junit" % "4.13.2" % Test
libraryDependencies += "com.typesafe.play" %% "play-java" % "2.8.8"

// Make verbose tests
(Test / testOptions) := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))
