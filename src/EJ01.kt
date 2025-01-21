class Rectangulo(var base: Int, var altura: Double){
    // En el init controlamos que la base y altura sean mayores que 0

    init{
        require(base > 0 && altura > 0) { "La base y altura deben ser mayores que 0." }
    }


    // Creamos dos constructores en caso de que falte información en el objeto del main

    constructor(base: Int): this(base, 5.0) {
        this.base = base
    }

    constructor(altura: Double): this(10, altura){
        this.altura = altura
    }


    override fun toString(): String {
        return "Base: $base, Altura: $altura, Area: ${calcularArea()}, Perimetro: ${calcularPerimetro()}"
    }

    // Este metodo calcula el perimetro del rectangulo

    fun calcularPerimetro() : String{
        val perimetro = base * 2 + altura * 2
        val solucion = "El perímetro de este rectángulo es $perimetro"
        return solucion
    }


    // Este metodo calcula el perimetro del rectangulo

    fun calcularArea() : String{
        val area = base * altura
        val solucion = "El área de este rectángulo es $area"
        return solucion
    }
}