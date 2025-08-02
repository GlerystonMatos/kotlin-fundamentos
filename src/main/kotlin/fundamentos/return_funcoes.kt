package fundamentos

fun retornaNumeroPorExtenso(numero: Int): String {
    return when (numero) {
        1 -> "Um"
        2 -> "Dois"
        3 -> "Três"
        4 -> "Quatro"
        5 -> "Cinco"
        6 -> "Seis"
        7 -> "Sete"
        8 -> "Oito"
        9 -> "Nove"
        else -> "Número fora do intervalo de 1 a 9"
    }
}

fun main() {
    println(retornaNumeroPorExtenso(1))  // Um
    println(retornaNumeroPorExtenso(5))  // Cinco
    println(retornaNumeroPorExtenso(10)) // Número fora do intervalo de 1 a 9
    println(retornaNumeroPorExtenso(0))  // Número fora do intervalo de 1 a 9
}