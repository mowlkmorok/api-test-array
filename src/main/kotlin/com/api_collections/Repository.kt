package com.api_collections

class Repository<T> {
    //Simulation of a data base
    //------------------------------------------
    // Here we did create a mutable map
    private val map = mutableMapOf<String, T>()
    
    // Here we did create a function 'create'
    fun create(id: String, value: T){
        map[id] = value
    }
    
    // Here we put the id as return
    fun findById(id: String) = map[id]

}
