package dojo

class MailBox {

  def handleMsg(msg: PingPongMessage) = msg match {
    case Ping => Pong
    case Pong => Ping
  }

  def receive(msg: Any) = msg match {
    case Ping => Pong
    case Pong => Ping
    case "stop" => "stopped"
    case Tuple2("echo", x) => x
  }

}
