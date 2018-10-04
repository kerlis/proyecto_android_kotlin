
package com.example.aplicacionkotlin.miprimeraaplicacion

class Auto(tipo: String, velocidad: Int, numeroasientos: Int){
}

fun main(args: Array<String>){
    var automovil =  Auto(tipo = "bmw", velocidad = 300, numeroasientos = 20 )
    println(automovil)
}