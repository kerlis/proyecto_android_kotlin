package com.example.aplicacionkotlin.miprimeraaplicacion

abstract class persona{

    var nombre:String?=null


    abstract  fun correr()
    abstract  fun saltar()

}

class hombre : persona(){
    override fun correr() {
        this.nombre
        TODO("not implemented")


    }

    override fun saltar() {
        TODO("not implemented")
    }
}