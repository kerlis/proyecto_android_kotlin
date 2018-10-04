package com.example.aplicacionkotlin.miprimeraaplicacion


/*
fun main(args: Array<String>){
     var nombres = arrayOf("luis", "carlos", "pedro")
    println(nombres[0])
    println(nombres[1])
    println(nombres[2])

    var numeroprimo = 2
    println("dsfdasf ${numeroprimo.toDouble()}")

}


fun main (args: Array<String>){
    var primero = 10
    var segundo = 20
    println("la multiplicacion es : ${primero * segundo}")
    println("la multiplicacion es : ${primero.times(segundo)}")

}
*/
//snapshop
// rc
//release
//beta
//alpha

// sentencias de transferencia

/*
fun main (args: Array<String>){

    print("ingrese edad:")
    var edad = readLine()
    if (edad!!.toInt() > 20)
    println("eres")

}
*/

//fun main (args: Array<String>){

  // print("ingrese edad:")
  // var nota = readLine()
/*

   if (nota!!.toInt() > 0 && nota!!.toInt() <=10){
       println("jalado")

   }

   else if (nota!!.toInt() > 11 && nota!!.toInt() <=13){
       println("regular")

   }

   else if (nota!!.toInt() > 14 && nota!!.toInt() <=16){
       println("bueno")

   }

   else if (nota!!.toInt() > 17 && nota!!.toInt() <=18){
       println("excelente")

   }

   else if (nota!!.toInt() > 19 && nota!!.toInt() <=20){
       println("sobresaleinte")

   }






    when (nota!!.toInt()) {
        in 0..9   -> print("jalado")
        in 11..13 -> print("regular")
        in 14..16 -> print("bueno")
        in 17..18 -> print("excelente")
        in 19..20 -> print("sobresaleinte")
         else -> { // Note the block
            print("no esta en el rango de notas")
        }
    }
*/



//}



/*
fun main (args: Array<String>){

    var x = 10
    for(y in 0..x){
        println("y=$y")

        print("ingrese el numero:")
        var numero = readLine()!!.toInt()
        var resultado = 1
        for(x in 1..numero)
            resultado *= x
        println("El factorial es :  $resultado")
    }
}


fun main (args: Array<String>){
    var x = 10
    while (x<=100){
        println("x=$x")
        x++
    }
    x = 10
    do {
        x++
        println("x=$x")
    }while (x<=100)
}

fun main (args: Array<String>){
    print("ingrese numero;")
    var numero = readLine()!!.toInt()
    var resultado = 1

    while (numero >= 1){
    resultado *= numero--
    }
    println("el numero factorial es:; $resultado")


}
*/




/*
fun main (args: Array<String>){

    for(x in 0..10){
        if(x == 5 ){
            println("encontrado")
            break
        }
        println("aun no se encuentra")
    }

    var contador = 0

    for(x in 1..10){
        contador = 0
        for (y in 1..x){
            if(x %y != 0) continue
            contador ++

        }

        if(contador == 2){
            println("$x no es primo")

        }

        var abc = 10
        println()
    }
}


*/


fun main(args: Array<String>){

    print("ingrese numero de 3 cifras;")

    var numero = readLine().toString()

  //  var valor = numero.toString()

    var cifra1 = numero[0].toInt()
    var cifra2 = numero[1]
    var cifra3 = numero[2]
  //  var numerodecombiunaciones = (cifra1.toInt()+cifra2.toInt())+cifra3.toInt()
    var cifra4 = cifra1!!.toInt()

    println("numero ${cifra4}")
    println("numero de combinaciones ${cifra1}")





}
