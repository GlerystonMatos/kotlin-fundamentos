package fundamentos

fun main() {
    println(parOuImpar(2))
    println(parOuImpar(3))
    resultadoDaNota(3)
    resultadoDaNota(5)
    resultadoDaNota(8)
}

fun parOuImpar(numero: Int): String {
    return if (numero % 2 == 0)
        "O número $numero é par"
    else
        "O número $numero é ímpar"
}

// se a nota for >=6 -> "Aprovado"
// se a nota for >4 -> "Recuperação"
// se a nota for <4 -> "Reprovado"
fun resultadoDaNota(nota: Int) {
    if (nota >= 6) {
        println("Aprovado")
    } else if (nota > 4) {
        println("Recuperação")
    } else {
        println("Reprovado")
    }
}