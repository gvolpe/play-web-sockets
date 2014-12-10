package controllers

import model.WSModel.{ProcessedUser, User}
import actors.{WSUsersActor, WSMessagesActor}
import play.api.mvc._
import play.api.Play.current

object Application extends Controller {

  import model.WSModel.Implicits._

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def messages = WebSocket.acceptWithActor[String, String] { request => out =>
    WSMessagesActor.props(out)
  }

  def users = WebSocket.acceptWithActor[User, ProcessedUser] { request => out =>
    WSUsersActor.props(out)
  }


}