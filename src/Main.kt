fun main() {
    println("Hello World!")
    var valor1: Int
    //valor1 = 10
    var valor2: Int
    //valor2 = 5

    println("Ingresa el primer valor: ")
    valor1 = readln().toInt()

    println("Ingresa el segundo valor: ")
    valor2 = readln().toInt()

    var resultado: Int = valor1 + valor2
    println("El la suma de $valor1 + $valor2 es: $resultado")

}