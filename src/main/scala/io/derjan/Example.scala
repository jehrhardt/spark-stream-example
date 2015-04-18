package io.derjan

object Example extends App with LocalSpark with Elasticsearch with LazyLogging {
  implicit val stream = QueueStream().map(word => Map("word" -> word, "length" -> word.length.toString))
  streamToEs("spark-example/words")

  streamingContext.start()
  streamingContext.awaitTermination()
}
