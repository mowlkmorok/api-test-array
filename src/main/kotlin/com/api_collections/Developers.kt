package com.api_collections

data class Developers (
    val name: String,
    val salary: Double,
    val hiringType: String
    ) {
        override fun toString(): String =
            """
            Name:   $name
            Salary: $salary
        """.trimIndent()
    }
