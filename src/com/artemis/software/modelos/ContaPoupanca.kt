package com.artemis.software.modelos

class ContaPoupanca(titular: Cliente, numero: Int): Conta(titular, numero) {

    override fun levantamento(valor: Double) {
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }
}