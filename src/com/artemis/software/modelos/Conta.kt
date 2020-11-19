package com.artemis.software.modelos

import com.artemis.software.exception.SaldoInsuficienteException


abstract class Conta(var titular: Cliente, val numero: Int) {

    var saldo = 0.0
        protected set

    companion object Contador {
        var total = 0
            private set
    }


    init {
       ++total
    }

    fun deposita(valor : Double){
        if(valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun levantamento(valor : Double)

    fun transferir(valor : Double, contaDestino : Conta) {

        if(saldo < valor){
            throw SaldoInsuficienteException()
        }

        saldo -= valor
        contaDestino.deposita(valor)
    }

}