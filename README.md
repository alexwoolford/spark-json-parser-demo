# Spark JSON parser demo

This is a simple example that shows how flat JSON can be read from a file straight into a Spark dataframe.

To run this on a Spark cluster:

    git clone https://github.com/alexwoolford/spark-json-parser-demo
    cd spark-json-parser-demo
    sbt package
    spark-submit target/scala-2.10/spark-json-parser-demo_2.10-1.0.jar