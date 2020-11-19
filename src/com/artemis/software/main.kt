package com.artemis.software

import com.artemis.software.modelos.*



fun main(){

    println("início main")

    val entrada: String = "1,9"


    val valor: Double? = try{
        entrada.toDouble()
    }
    catch(e: NumberFormatException){
        println("NumberFormatException message: ${e.message}")
        println("NumberFormatException cause: ${e.cause}")
        null
    }

    println("Valor final: ${valor}")


    val valorComTaxa : Double? = if(valor != null){
        valor + 1
    }
    else{
        null
    }

    println("valorComTaxa final: ${valorComTaxa}")


    funcao1()
    println("fim main")
}

fun funcao1(){
    println("início funcao1")
    funcao2()
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5){
        println(i)
        
    }
    println("fim funcao2")
}