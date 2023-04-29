fun main() {

    print("Digite um número: ")
    val numero = readLine()!!.toInt()


    val fibonacci = mutableListOf(0, 1)
    var proximo = fibonacci[0] + fibonacci[1]
    while (proximo <= numero) {
        fibonacci.add(proximo)
        proximo = fibonacci[fibonacci.size - 1] + fibonacci[fibonacci.size - 2]
    }


    if (numero in fibonacci) {
        println("$numero pertence à sequência de Fibonacci.")
    } else {
        println("$numero não pertence à sequência de Fibonacci.")
    }


    println("A sequência de Fibonacci até $numero é: $fibonacci")
}