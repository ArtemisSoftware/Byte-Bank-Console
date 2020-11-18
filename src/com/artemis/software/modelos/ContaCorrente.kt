package com.artemis.software.modelos

class ContaCorrente(titular: Cliente, numero: Int): Conta(titular, numero){

    override fun levantamento(valor: Double) {
        val valorComTaxa = valor + 0.1

        if(this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }
}