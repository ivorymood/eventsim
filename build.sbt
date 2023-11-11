import sbtassembly.AssemblyPlugin.autoImport._

assemblyMergeStrategy := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}

name := "eventsim"

version := "1.0"

scalaVersion := "2.12.2"

libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "2.2.0"

libraryDependencies += "org.json4s" %% "json4s-native" % "3.6.12"

libraryDependencies += "org.apache.commons" % "commons-math3" % "3.5"

libraryDependencies += "de.jollyday" % "jollyday" % "0.5.1"

libraryDependencies += "org.rogach" %% "scallop" % "3.3.2"

libraryDependencies += "com.fasterxml.jackson.core" % "jackson-annotations" % "2.12.2" exclude("com.fasterxml.jackson.core", "module-info.class")

libraryDependencies += "com.fasterxml.jackson.core" % "jackson-core" % "2.12.2" exclude("com.fasterxml.jackson.core", "module-info.class")

libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.12.2" exclude("com.fasterxml.jackson.core", "module-info.class")

libraryDependencies += "org.apache.kafka" % "kafka_2.10" % "0.8.2.1"