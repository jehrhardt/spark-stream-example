package io.derjan

import org.apache.spark.SparkContext
import org.apache.spark.streaming.StreamingContext

trait Spark {
  def sparkContext: SparkContext

  def streamingContext: StreamingContext
}
