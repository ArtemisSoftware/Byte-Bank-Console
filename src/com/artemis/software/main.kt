package com.artemis.software

import com.artemis.software.exception.SaldoInsuficienteException
import com.artemis.software.modelos.*
import java.lang.ClassCastException
import java.lang.Exception


fun main(){

    println("início main")

    try{
        funcao2()
    }
    catch (e : SaldoInsuficienteException){
        e.printStackTrace()
        println("SaldoInsuficienteException")
    }

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
        val endereco = Any()
        throw SaldoInsuficienteException()

    }
    println("fim funcao2")
}
