package com.api_collections

fun main() {

    val array1 = arrayOf(
        "2000".toBigDecimal(),
        "4500".toBigDecimal(),
        "1300".toBigDecimal()
    )
    println("----------------------")
    // Call the extended function 'toALLPLUS' and print it
    println("Plus all: ${ array1.toAllPLUS() }")

    println("----------------------")
    // Call the extended function 'toAverage1' and print it
    println("Average: ${ array1.toAverage1() }")

}