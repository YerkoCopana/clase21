
abstract class Vehiculo(
  val marca: String,
  val velocidadMaxima: Double
) {
  def descripcion(): String
}

trait Electrico {
  def tipoMotor(): String = "Motor eléctrico"
}

trait Recargable {
  def recargar(): String = "Vehículo recargándose"
}

class Automovil(
  marca: String,
  velocidadMaxima: Double
) extends Vehiculo(marca, velocidadMaxima) {
  override def descripcion(): String =
    s"Automóvil $marca, velocidad máxima: $velocidadMaxima km/h"
}

class Motocicleta(
  marca: String,
  velocidadMaxima: Double
) extends Vehiculo(marca, velocidadMaxima) {
  override def descripcion(): String =
    s"Motocicleta $marca, velocidad máxima: $velocidadMaxima km/h"
}

class AutoElectrico(
  marca: String,
  velocidadMaxima: Double
) extends Vehiculo(marca, velocidadMaxima)
    with Electrico
    with Recargable {
  override def descripcion(): String =
    s"Auto eléctrico $marca, velocidad máxima: $velocidadMaxima km/h"
}

def main(args: Array[String]): Unit = {
  val automovil = new Automovil("Toyota", 180)
  val motocicleta = new Motocicleta("Honda", 200)
  val autoElectrico = new AutoElectrico("Tesla", 250)

  println(automovil.descripcion())
  println(motocicleta.descripcion())
  println(autoElectrico.descripcion())
  println(autoElectrico.tipoMotor())
  println(autoElectrico.recargar())
}
