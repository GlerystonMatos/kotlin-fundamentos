package fundamentos

fun main() {
    println("Hello, Kotlin!")
    println(retornaNome("Gleryston Matos"))
    dizOi("Sophia Matos", 4)
    dizOi(retornaNome("Gleryston Matos"), 4)
    dizOi(idade = 4, nome = "Sophia Matos")
    dizOi(nome = "Sophia Matos")
}

fun retornaNome(nome: String): String {
    return "Meu nome é $nome"
}

fun dizOi(nome: String, idade: Int = 3): Unit {
    println("Oi, $nome parabéns pelos seus $idade anos")
}