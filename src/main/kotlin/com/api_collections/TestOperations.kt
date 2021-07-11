package com.api_collections

fun main(){

    val salary = doubleArrayOf(
        2000.0,
        2500.0,
        5000.0,
        5500.0,
        10000.0,
        1500.0,
        1250.0)

    // Filtering salary bigger of than 2000
    val salaryOfThan2000 = salary.filter { it < 2000f }
    salaryOfThan2000.forEach{
        println(it)
    }

    println("----------------------------------------------------")

    // To show salary between 1000.0 and 1900.0
    val btween1000and2000 = salary.count { it in 1000.0..1900.0 }
    println(btween1000and2000)

    println("----------------------------------------------------")

    // Find any value if true will show value if false will show null
    val findSalaryValue =  salary.find { it == 200.0 }  // Null variable
    println(findSalaryValue)    // This print is null

    println("----------------------------------------------------")

    // If any value = 2000.0
    val findValue = salary.any { it == 2000.0 }
    println(findValue)

    println("----------------------------------------------------")

    println("Bigger salary: ${salary.maxOrNull()}")
    println("Bigger salary: ${salary.minOrNull()}")
    println("Bigger salary: ${salary.average()}")


}