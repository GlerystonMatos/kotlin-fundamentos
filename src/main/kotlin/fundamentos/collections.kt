package fundamentos

fun main() {
    val lista = listOf<Int>(1, 4, 6, 2, 3, 2)
    lista.filter { it % 2 == 0 }.forEach {
        println(it)
    }

    println(lista[0])
    println(lista.get(1))
    println(lista.size)
    println(lista.indexOf(6))

    val mutableLista = mutableListOf<Int>(1, 4, 6, 2, 3, 2)
    println(mutableLista)
    mutableLista.add(8)
    println(mutableLista)
    mutableLista.removeAt(0)
    println(mutableLista)
    mutableLista.remove(3)
    println(mutableLista)

    mutableLista[0] = 20
    println(mutableLista)

    mutableLista.sort()
    println(mutableLista)

    mutableLista.shuffle()
    println(mutableLista)

    var setNumeros = setOf(1, 2, 3, 2)
    println(setNumeros)

    val mutableSet = mutableSetOf<Int>(1, 4, 6, 2, 3, 2)
    println(mutableSet.contains(2))

    var mapNomeIdade = mapOf<String, Int>("Gleryston" to 31, "Sophia" to 4)
    println(mapNomeIdade)

    var mutableMapNomeIdade = mutableMapOf<String, Int>("Gleryston" to 31, "Sophia" to 4)
    println(mutableMapNomeIdade)

    mutableMapNomeIdade.put("Sophia", 3)
    println(mutableMapNomeIdade)

    mutableMapNomeIdade["Sophia"] = 4
    println(mutableMapNomeIdade)

    mutableMapNomeIdade.remove("Sophia")
    println(mutableMapNomeIdade)

    mutableMapNomeIdade.put("Sophia", 3)
    println(mutableMapNomeIdade)

    mutableMapNomeIdade.put("Sophia", 4)
    println(mutableMapNomeIdade)

    mutableMapNomeIdade.putIfAbsent("Sophia", 5)
    println(mutableMapNomeIdade)
}