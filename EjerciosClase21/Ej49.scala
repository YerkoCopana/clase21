abstract class animal (val nombre: String) {
  def sonido(): String
}

trait volador {
  def volar(): String = "Estoy volando"
}

trait nadador {
  def nadar(): String = "Estoy nadando"
}

class perro(nombre: String) extends animal(nombre) {
   override def sonido(): String = "Guau"
}
class pato(nombre: String) extends animal(nombre) with volador with nadador{
    override def sonido(): String = "Cuac"
}

class pescado(nombre : String) extends animal(nombre) with nadador {
    override def sonido(): String = "glu glu glu" 
} 

def main (args: Array[String]): Unit = {
  val miPerro = new perro("Firulais")
  val miPato = new pato("Donald")
  val miPescado = new pescado("Nemo")

  println(s"${miPerro.nombre} dice: ${miPerro.sonido()}")
  println(s"${miPato.nombre} dice: ${miPato.sonido()} y ${miPato.volar()} y ${miPato.nadar()}")
  println(s"${miPescado.nombre} dice: ${miPescado.sonido()} y ${miPescado.nadar()}")
}