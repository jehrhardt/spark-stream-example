package io.derjan

import com.typesafe.scalalogging.Logging
import com.typesafe.scalalogging.slf4j.Logger
import org.slf4j.LoggerFactory

trait LazyLogging extends Logging{
  override protected lazy val logger = Logger(LoggerFactory.getLogger(getClass.getName))
}
