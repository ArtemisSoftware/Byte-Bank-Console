package com.artemis.software.modelos

import com.artemis.software.exception.FalhaAutenticacaoException
import com.artemis.software.exception.SaldoInsuficienteException


abstract class Conta(var titular: Cliente, val numero: Int) : Autenticavel {

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

    fun transferir(valor : Double, contaDestino : Conta, senha: Int) {

        if(saldo < valor){
            throw SaldoInsuficienteException("O saldo é isuficiente, saldo atual ${saldo}")
        }
        if(!autenticar(senha)){
            throw FalhaAutenticacaoException()
        }

        saldo -= valor
        contaDestino.deposita(valor)
    }

    override fun autenticar(senha: Int): Boolean {
        return titular.autenticar(senha)
    }

}