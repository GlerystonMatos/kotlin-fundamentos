package fundamentos

fun main() {
    var nome: String = "Gleryston Matos"
    val idadeVal: Int = 31

    nome = "Sophia Matos"
    var idade: Int = 4

    println(idade)

    val teste: String
    teste = "Teste de variavel val"

    var texto = "Texto de variavel var"
    texto = 123.toString()
}

class Variaveis {
    lateinit var teste: String

    fun inicializar() {
        teste = "Inicializado"
    }
}