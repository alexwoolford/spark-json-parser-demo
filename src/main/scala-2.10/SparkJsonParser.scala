import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkConf, SparkContext}

object SparkJsonParser {

  def main(args: Array[String]): Unit ={

    val conf = new SparkConf()
      .setMaster("local[*]")
      .setAppName("Spark JSON parser")
      .set("spark.executor.memory", "2g")

    val sc = new SparkContext(conf)

    val sqlContext = new SQLContext(sc)

    val df = sqlContext.read.json("src/main/resources/flat.json").toDF()
    df.show()

  }

}
