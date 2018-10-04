package com.example.aplicacionkotlin.miprimeraaplicacion

class Camioneta{

    var tipo: String? =  null
    var velocidad: Int? =  null
    var numeroAsientos: Int? = null
}

fun main (args: Array<String>){
    var variable  = Camioneta()
    variable.tipo ="Nissan"
    variable.velocidad = 200
    variable.numeroAsientos = 5

    println("Tipo: ${variable.tipo}")
    println("Velocidad: ${variable.velocidad}")
    println("Numero de Asientos: ${variable.numeroAsientos}")

}