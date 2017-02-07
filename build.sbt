name := "spark-json-parser-demo"

version := "1.0"

scalaVersion := "2.10.6"

libraryDependencies += "org.apache.spark" % "spark-core_2.10" % "1.6.2"
libraryDependencies += "org.apache.spark" % "spark-sql_2.10" % "1.6.2"

mainClass in Compile := Some("SparkJsonParser")

