package io.derjan

import org.apache.spark.SparkContext
import org.apache.spark.streaming.StreamingContext
import org.apache.spark.streaming.dstream.DStream

import scala.collection.mutable

object QueueStream {
  def apply()(implicit sparkContext: SparkContext, streamingContext: StreamingContext): DStream[String] = {
    val data = mutable.Queue(
      sparkContext.makeRDD(mutable.Seq("Hello", "world")),
      sparkContext.makeRDD(mutable.Seq("foo")))

    streamingContext.queueStream(data)
  }
}
