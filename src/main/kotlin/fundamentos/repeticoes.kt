package fundamentos

fun main() {
    printa1a10()
    println("")
    printa10a1()
    println("")
    printaPar1a10()
    println("")
    printaRange(10, 20)
    println("")
    whileMenorQue10()
    println("")
    doWhileMenorQue10()
}

fun whileMenorQue10() {
    var numero = 0
    while (numero < 10) {
        println(numero)
        numero++
    }
}

fun doWhileMenorQue10() {
    var numero = 0
    do {
        println(numero)
        numero++
    } while (numero < 10)
}

fun printa1a10() {
    for (numero in 1..10) {
        println(numero)
    }
}

fun printa10a1() {
    for (numero in 10 downTo 1) {
        println(numero)
    }
}

fun printaPar1a10() {
    for (numero in 2..10 step 2) {
        println(numero)
    }
}

fun printaRange(inicio: Int, fim: Int) {
    for (numero in inicio..fim) {
        println(numero)
    }
}