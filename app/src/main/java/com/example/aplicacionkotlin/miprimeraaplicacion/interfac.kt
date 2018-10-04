package com.example.aplicacionkotlin.miprimeraaplicacion

interface AlumnoDao{
    fun guardaralumno()
    fun buscaralumnmo()
    fun aliminaralumno()
    fun actualizaralumno()
}

class AlumnoDaoImpl: AlumnoDao{

    var nombre:String? =""
    override fun guardaralumno() {
        TODO("not implemented")
    }
    override fun buscaralumnmo() {
        TODO("not implemented")

    }
    override fun aliminaralumno() {
        TODO("not implemented")
    }
    override fun actualizaralumno() {
        TODO("not implemented")
    }


    fun getnombre():String?{
        return  this.nombre
    }
}

fun main(args: Array<String>){
    var alumnoDao: AlumnoDao = AlumnoDaoImpl()
    var alumno5 = AlumnoDaoImpl()

}

fun validar(args: Array<Double>){


}