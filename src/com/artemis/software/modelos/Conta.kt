package com.artemis.software.modelos

abstract class Conta(var titular: Cliente, val numero: Int) {

    var saldo = 0.0
        protected set

    fun deposita(valor : Double){
        if(valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun levantamento(valor : Double)

    fun transferir(valor : Double, contaDestino : Conta): Boolean {
        if(saldo >= valor){
            saldo -= valor
            contaDestino.deposita(valor)
            return true
        }
        else{
            return false
        }
    }

}