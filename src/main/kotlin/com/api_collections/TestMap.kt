package com.api_collections

fun main(){
    // Map one
    val mariana: Pair<String, Double> = Pair("Mariana", 2000.0)
    val mapMariana = mapOf(mariana)
    // Show key and values
    mapMariana.forEach { (k, v) ->  println("Key: $k  -  Value: $v")}


    println("-------------------------------------------------------")

    // Map Two
    val iMap2 = mapOf(
        "Joao" to 1500.0,
        "Gabi" to 1900.0
    )
    // Show key and values
    iMap2.forEach{
        println(it)
    }

}