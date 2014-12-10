package actors

import akka.actor.{ActorRef, Props, Actor}

object WSMessagesActor {

  def props(out: ActorRef) = Props(new WSMessagesActor(out))

}

class WSMessagesActor(out: ActorRef) extends Actor {

  def receive = {
    case msg: String => out ! ("Message processed >> " + msg)
  }

}
