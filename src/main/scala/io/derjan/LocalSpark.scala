package io.derjan

import org.apache.spark.{SparkContext, SparkConf}
import org.apache.spark.streaming.{Seconds, StreamingContext}

trait LocalSpark {
  private val conf = new SparkConf().setAppName("streaming-example").setMaster("local[2]")

  implicit val sparkContext = new SparkContext(conf)

  implicit val streamingContext = new StreamingContext(sparkContext, Seconds(1))
}
