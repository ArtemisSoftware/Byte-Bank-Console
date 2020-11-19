package com.artemis.software

import com.artemis.software.exception.SaldoInsuficienteException
import com.artemis.software.modelos.*
import java.lang.ClassCastException
import java.lang.Exception


fun main(){

    val joao = Cliente("joao", "222-444.232", Endereco(), 4321)
    val maria = Cliente("maria", "222-444.232", Endereco(),4321)

    val contaJoao = ContaCorrente(joao, 1000)
    val contaPoupanca = ContaPoupanca(maria, 1001)

    contaJoao.deposita(1000.0)

    try{
        contaJoao.transferir(30.0, contaPoupanca, 4321)
        println("Transferencia realizada com sucesso")
    }
    catch (e : SaldoInsuficienteException){
        println("Erro na Transferencia")
        e.printStackTrace()
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
