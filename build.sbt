name := "SparkStreaming"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.11" % "2.0.0",
  "org.apache.spark" % "spark-sql_2.11" % "2.0.0",
  "org.apache.spark" % "spark-hive_2.11" % "2.0.0",
  "org.apache.spark" % "spark-streaming_2.11" % "2.0.0",
  "org.scala-lang.modules" % "scala-xml_2.11" % "1.0.6",
  "org.twitter4j" % "twitter4j-core" % "4.0.4",
  "org.twitter4j" % "twitter4j-stream" % "4.0.4",
  "org.apache.bahir" %% "spark-streaming-twitter" % "2.0.0"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

excludeFilter in Compile in unmanagedSources := ".#*" || "FromXml.scala"