package com.api_collections

fun main() {
    var x: Int
    val array1 = IntArray(5)
    array1[1] = 1
    array1[2] = 2
    array1[2] = 3
    array1[3] = 4


    //for (values in array1) print(values)
    for (values in 0..4){
        println("${array1[values]}")
    }

    println("---------------------------------")

    array1.forEach {
        println(it)
    }

}