package io.derjan

import org.apache.spark.streaming.dstream.DStream
import org.elasticsearch.spark._

trait Elasticsearch {
  def streamToEs(esPath: String)(implicit stream: DStream[Map[String, String]]) = {
    stream.foreachRDD(_.saveToEs(esPath))
  }
}
