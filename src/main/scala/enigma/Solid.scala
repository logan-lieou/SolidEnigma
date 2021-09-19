package enigma

import org.apache.spark.ml.classification.LogisticRegression
import org.apache.spark.linalg.{Matrix, Vectors}
import org.apache.spark.ml.stat.Correlation

object Solid extends App {
   // fake data
   val data = Vectors.dense(6.0, 7.0, 0.0, 8.0)

   val someCorr = Correlation.corr(data)

   // output data
   println(s"Correlation: $someCorr")
}
