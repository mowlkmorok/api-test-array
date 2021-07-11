package com.api_collections


fun main(){

    val maria = Developers("Maria", 2000.00)
    val juh = Developers("Juliana", 3800.00)
    val karina = Developers("Kariana", 1400.00)
    val paty = Developers("Patricia", 4000.00)

    val allDevelopers = listOf(maria, juh, karina, paty)
    // Show data class
    allDevelopers.forEach{
        println(it)
        println("----------------------------------------------------")
    }




}

data class  Developers(
    val name: String,
    val salary: Double
) {
    override fun toString(): String =
        """
            Name:   $name
            Salary: $salary
        """.trimIndent()
}