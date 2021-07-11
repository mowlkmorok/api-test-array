package com.api_collections

import java.io.File

fun main() {

    //  testing of arrayof
    val myFile = "test.txt"
    val array1 = arrayListOf<String>("Maria", "\nJoana", "\nPaua", "\nAline")

    println(array1[0])



    println("===============================")

    array1.forEach {
        println(it)

        val x = File(myFile).writeText(array1.toString())
    }

    println("================================")

    array1.forEachIndexed { index, values ->
        println(array1[index])
        val xx = File(myFile)

    }
    println("================================")

    array1.remove("Maria")

    array1.forEach {
        println(it)
    }


}