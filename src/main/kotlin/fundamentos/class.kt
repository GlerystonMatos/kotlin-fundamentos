package fundamentos

data class DataPessoa(var nome: String, var idade: Int) {
}

class Pessoa(var nome: String, var idade: Int) {

    override fun toString(): String {
        return "Classe :Pessoa, Nome: $nome, Idade: $idade"
    }
}

fun main() {
    val dataPessoa = DataPessoa("Gleryston Matos", 31)
    println(dataPessoa);

    val pessoa = Pessoa("Gleryston Matos", 31)
    println(pessoa)
}