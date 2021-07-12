package com.api_collections

fun main() {

    val joana = Developers("Joana", 1380.0, "CLT")
    val paula = Developers("Paula", 1980.0, "PG")
    val tatyana = Developers("Tatyana", 8980.0, "CLT")
    val tay = Developers("Tay", 1780.0, "CLT")

    // Instantiated a repository
    val repository = Repository<Developers>()


    println("================================================")
    // Putting value and your id
    repository.create(joana.name, joana)
    repository.create(paula.name, paula)
    repository.create(tatyana.name, tatyana)

    // Removing tatyana value
    repository.remove(tatyana.name)

    //=========================================================
    repository.showAll().forEach{ println(it) }


}