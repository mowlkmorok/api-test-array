package com.api_collections


fun main(){

    val joana = Developers("Joana", 1380.0, "CLT")
    val paula = Developers("Paula", 1980.0, "PG")
    val tatyana = Developers("Tatyana", 8980.0, "CLT")
    val tay = Developers("Tay", 1780.0, "CLT")

    // Making setInstance groups
    val developer1 = setOf(joana, tay)
    val developer2 = setOf(tatyana, joana, paula)
    val developer3 = setOf(tatyana, tay, paula)


        // Get together instances
    developer1.union(developer2).forEach{
        println(it)
        println("------------------------------------")
    }
    println("========================================")

    val subtractValue = developer1
        .subtract(developer2)
        .forEach {
            println(it)
            println("------------------------------------")
        }
    println("========================================")

    // Show the equals
    val intersectResult = developer2.intersect(developer3)
        intersectResult.forEach {
            println(it.name)
            println("------------------------------------")
        }


}