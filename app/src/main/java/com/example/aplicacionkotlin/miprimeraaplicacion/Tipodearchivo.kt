package com.example.aplicacionkotlin.miprimeraaplicacion

enum class Tipodearchivo{

    xls(indice = 1, valor = "excel"),
    txt(indice = 2, valor = "notepad"),
    pdf(indice = 3, valor = "adobe"),
    avi(indice = 4, valor = "media player"),
    ftl(indice = 5, valor = "fremarker");

    var indice: Int?= null
    var valor:String?= null

    constructor(indice: Int, valor: String){
        this.indice = indice
        this.valor = valor
    }
}

fun main(args: Array<String>){
    println(Tipodearchivo.avi)
}