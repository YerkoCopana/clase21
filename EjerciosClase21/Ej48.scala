trait figura {
  def area: Double
}

class recatngulo(val base: Double, val altura: Double) extends figura {
  def area: Double = base * altura
}

class circulo(val radio: Double) extends figura {
  def area: Double = Math.PI * radio * radio
}

class triangulo(val base: Double, val altura: Double) extends figura {
  def area: Double = (base * altura) / 2
}

def mostrarFigura(figura: figura): Double = {
  println(s"El área de la figura es: ${figura.area}")
  figura.area
}

def main (args: Array[String]): Unit = {
  val rectangulo = new recatngulo(5, 10)
  val circulo = new circulo(7)
  val triangulo = new triangulo(4, 6)

  mostrarFigura(rectangulo)
  mostrarFigura(circulo)
  mostrarFigura(triangulo)
}
