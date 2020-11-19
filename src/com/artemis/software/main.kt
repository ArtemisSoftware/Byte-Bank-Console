package com.artemis.software

import com.artemis.software.modelos.*



fun main(){

    println("início main")

    try{
        10/0
    }
    catch(e: ArithmeticException){
        println("ArithmeticException ")
    }

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