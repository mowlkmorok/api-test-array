package com.api_collections

fun main(){

    val joana = Developers("Joana", 1380.0, "CLT")
    val paula = Developers("Paula", 1980.0, "PG")
    val tatyana = Developers("Tatyana", 8980.0, "CLT")
    val tay = Developers("Tay", 1780.0, "CLT")

    // Make a mutable list
    val mutList1 = mutableListOf(joana, paula)

    // Adding 'tatyana' in mutList1
    mutList1.add(tatyana)
    mutList1.forEach {
        println(it)
        println("---------------------------------")
    }
    // Just a print separator
    println("=====================================")

    // REMOVING tatyana of mutList1
    mutList1.remove(tatyana)
    mutList1.forEach {
        println(it)
        println("---------------------------------")
    }

}