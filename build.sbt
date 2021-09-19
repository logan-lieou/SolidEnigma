name := "MLScala"

scalaVersion := "2.12.14"

organization := "co.jeboria"

libraryDependencies ++= Seq(
	"org.scalanlp" %% "breeze" % "1.2",
	"org.apache.spark" %% "spark-core" % "3.1.2",
	"org.apache.spark" %% "spark-mllib" % "3.1.2"
)
