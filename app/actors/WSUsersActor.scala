package actors

import Model.WSModel.{ProcessedUser, User}
import akka.actor.{ActorRef, Props, Actor}

import scala.util.Random

object WSUsersActor {

  def props(out: ActorRef) = Props(new WSUsersActor(out))

}

class WSUsersActor(out: ActorRef) extends Actor {

  def receive = {
    case user: User => out ! ProcessedUser(Random.nextInt(100), user.name)
  }

}