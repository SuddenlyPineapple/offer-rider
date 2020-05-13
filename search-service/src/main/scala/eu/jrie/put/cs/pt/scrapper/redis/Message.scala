package eu.jrie.put.cs.pt.scrapper.redis

object Message {
  trait RedisMessage

  case class TaskMessage(taskId: String, params: Map[String, String]) extends RedisMessage
  case class ResultMessage(
                            taskId: String,
                            offerId: Option[String],
                            title: String,
                            subtitle: Option[String],
                            url: String,
                            imgUrl: Option[String],
                            price: Double,
                            currency: String,
                            params: Map[String, String],
                            last: Boolean
                          ) extends RedisMessage
}
