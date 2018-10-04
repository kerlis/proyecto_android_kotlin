package com.example.aplicacionkotlin.miprimeraaplicacion

fun main (args: Array<String>){
    factorial()
}


fun factorial(){
    print("ingrese numero::")
    var numero:Int = readLine()!!.toInt()
    var resultado = 1

    for (x in 1..numero){
        resultado *= x
    }
    println("el factorial es: $resultado")
}