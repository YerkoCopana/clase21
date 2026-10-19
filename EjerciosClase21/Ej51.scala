
trait Notificacion {
  def enviar(mensaje: String): String
}

class Email extends Notificacion {
  override def enviar(mensaje: String): String =
    s"Enviando correo: $mensaje"
}

class SMS extends Notificacion {
  override def enviar(mensaje: String): String =
    s"Enviando SMS: $mensaje"
}

class Push extends Notificacion {
  override def enviar(mensaje: String): String =
    s"Enviando notificación: $mensaje"
}

def procesarNotificacion(
  notificacion: Notificacion,
  mensaje: String
): String = {
  notificacion.enviar(mensaje)
}

def main(args: Array[String]): Unit = {
  val email = new Email
  val sms = new SMS
  val push = new Push

  println(procesarNotificacion(email, "Hola, este es un correo."))
  println(procesarNotificacion(sms, "Hola, este es un SMS."))
  println(procesarNotificacion(push, "Hola, esta es una notificación."))
}
