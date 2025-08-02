package fundamentos.classe

class Carro(var cor: String, val anoFabricacao: Int, val dono: Dono) {
}

class Dono(var nome: String, var idade: Int) {

    override fun toString(): String {
        return "Classe :Pessoa, Nome: $nome, Idade: $idade"
    }
}

fun main() {
    val carro = Carro("Branco", 1969, Dono("Gleryston Matos", 31))
    println(carro.cor)

    carro.cor = "Preto"
    println(carro.cor)

    println(carro.dono)
    println(carro.dono.nome)

    carro.dono.nome = "Sophia Matos"
    println(carro.dono.nome)
}