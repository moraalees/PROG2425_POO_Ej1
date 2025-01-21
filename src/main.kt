fun main(){
    val rectangulo1 = Rectangulo(9)
    println(rectangulo1.calcularPerimetro())
    println(rectangulo1.calcularArea())
    println(rectangulo1)

    val rectangulo2 = Rectangulo(120.5)
    println(rectangulo2)

    val rectangulo3 = Rectangulo(2, 4.4)
    println(rectangulo3)


    // Rectángulo con errores
    val rectangulo4 = try {
        Rectangulo(0, 0.0)
    } catch (e: IllegalArgumentException) {
        println("ERROR - ${e.message}")
    }

    println(rectangulo4)
}