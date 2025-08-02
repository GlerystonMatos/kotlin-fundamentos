package fundamentos

fun main() {
    var nome: String? = null;
    nome = "Gleryston Matos"

    if (nome != null) {
        println(nome.length)
    } else {
        println("Nome é nulo")
    }

    println(nome?.length?.toShort())

    val toShort: Short = nome!!.length.toShort()

    var tamanho: Int = nome?.length ?: 0

    println(tamanho)

    var lista: List<Int?> = listOf(1, 2, null, 3)
    var listaNull: List<Int>? = null

    var pessoa: Pessoa? = Pessoa("Gleryston", 31)
    //pessoa = null

    println(pessoa!!.nome)
    println("Finalizando o programa")
}