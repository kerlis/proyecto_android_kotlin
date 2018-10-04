package com.example.aplicacionkotlin.miprimeraaplicacion

fun main (args: Array<String>){
    factorial()
}


fun factorial():Unit{
    print("ingrese numero::")
    var numero:Int = readLine()!!.toInt()
    var resultado = 1

    for (x in 1..numero){
        resultado *= x
    }
    println("el factorial   rewfrefes: $resultado")
}

/*
git add
git add file.kt
git status
git commit -m ""
git push origin master
git fetch
git pull



COMPOSICION DE UNA CLASE

paquete                   no
import                    no
definicion de clase       si
atributos                 no
constructor               si
funciones                 no




*/