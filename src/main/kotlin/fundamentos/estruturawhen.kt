package fundamentos

fun main() {
    var numero = 25

    when (numero) {
        5, -5, 6, 7 -> println("numero: 5")
        8 -> println("numero: 8")
        9 -> println("numero: 9")
        10 -> {
            println("numero: 10")
            println("numero é uma dezena")
        }

        in 11..15 -> println("numero está entre 11 e 15")
        !in 16..20 -> println("numero não está entre 16 e 20")
        else -> println("numero não mapeado")
    }

    println(comecaComOi("oi, tudo bem?"))
    println(comecaComOi("tudo bem?"))
    println(comecaComOi(5))

    when {
        comecaComOi(5) -> println("5")
        comecaComOi("oi, tudo bem?") -> println("oi, tudo bem?")
    }
}

fun comecaComOi(x: Any): Boolean {
    return when (x) {
        is String -> x.startsWith("oi")
        else -> false
    }
}