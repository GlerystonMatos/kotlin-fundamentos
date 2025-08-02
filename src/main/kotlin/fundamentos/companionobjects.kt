package fundamentos

class MinhaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    companion object {
        fun criaClasse(): MinhaClasse {
            return MinhaClasse("Gleryston Matos", "Rua Teste", 31)
        }

        fun toMinhaClasse(segundaClasse: SegundaClasse): MinhaClasse {
            return MinhaClasse(segundaClasse.nome, segundaClasse.endereco, segundaClasse.idade)
        }
    }
}

class SegundaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    fun criaClasse(): SegundaClasse {
        return SegundaClasse("Gleryston Matos", "Rua Teste", 31)
    }
}

fun main() {
    var segundaClasse = SegundaClasse("Gleryston Matos", "Rua Teste", 31).criaClasse()
    var minhaClasse = MinhaClasse.criaClasse()
    var minhaClasseSegunda: MinhaClasse = MinhaClasse.toMinhaClasse(segundaClasse)
}