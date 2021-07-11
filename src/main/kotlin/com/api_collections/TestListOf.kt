package com.api_collections


fun main(){

    val maria = Developers("Maria", 2000.00, "CLT")
    val juh = Developers("Juliana", 3800.00,"PJ")
    val karina = Developers("Kariana", 1400.00,"CLT")
    val paty = Developers("Patricia", 4000.00,"PJ")

    val allDevelopers = listOf(maria, juh, karina, paty)
    // Show data class
    allDevelopers.forEach{
        println(it)
        println("----------------------------------------------------")
    }

    println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||")

    // Chains functions
    allDevelopers
        .sortedBy { it.salary }
        .forEach {
            println(it)
            println("-------------------------------------------------")
        }
    println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||")

    // GroupBy
    allDevelopers
        .groupBy { it.hiringType }
        .forEach {
            println(it)
            println("-------------------------------------------------")
        }


}

