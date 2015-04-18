package io.derjan

import org.apache.spark.streaming.dstream.DStream

trait Stream[T] {
  def stream: DStream[T]
}
