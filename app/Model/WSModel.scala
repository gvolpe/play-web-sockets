package Model

import play.api.libs.json.Json
import play.api.mvc.WebSocket.FrameFormatter

object WSModel {

  case class User(name: String)
  case class ProcessedUser(id: Long, name: String)

  object Implicits {

    implicit val userFormat = Json.format[User]
    implicit val processedUserFormat = Json.format[ProcessedUser]

    implicit val userFrameFormatter = FrameFormatter.jsonFrame[User]
    implicit val processedUserFrameFormatter = FrameFormatter.jsonFrame[ProcessedUser]

  }

}
