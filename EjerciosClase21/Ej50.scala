
abstract class Empleado(
  val nombre: String,
  val salarioBase: Double
) {
  def salarioTotal: Double
}

class Desarrollador(
  nombre: String,
  salarioBase: Double,
  bono: Double
) extends Empleado(nombre, salarioBase) {
  override def salarioTotal: Double =
    salarioBase + bono
}

class Vendedor(
  nombre: String,
  salarioBase: Double,
  ventas: Double,
  porcentajeComision: Double
) extends Empleado(nombre, salarioBase) {
  override def salarioTotal: Double =
    salarioBase + ventas * porcentajeComision / 100
}

class Gerente(
  nombre: String,
  salarioBase: Double,
  porcentajeBono: Double
) extends Empleado(nombre, salarioBase) {
  override def salarioTotal: Double =
    salarioBase + salarioBase * porcentajeBono / 100
}

def main(args: Array[String]): Unit = {
  val desarrollador = new Desarrollador("Juan", 3000, 500)
  val vendedor = new Vendedor("María", 2500, 10000, 10)
  val gerente = new Gerente("Pedro", 4000, 20)

  println(s"${desarrollador.nombre} tiene un salario total de: ${desarrollador.salarioTotal}")
  println(s"${vendedor.nombre} tiene un salario total de: ${vendedor.salarioTotal}")
  println(s"${gerente.nombre} tiene un salario total de: ${gerente.salarioTotal}")
}