import org.apache.spark.sql.SparkSession

object Main {
  def main(args: Array[String]) = {
    val spark = SparkSession.builder().appName("test").getOrCreate()
    val AutoUsersDF = spark.read.json("/labs/laba02/autousers.json")
    AutoUsersDF.show()
  }
}