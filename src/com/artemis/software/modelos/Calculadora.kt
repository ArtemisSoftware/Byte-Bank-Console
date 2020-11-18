package com.artemis.software.modelos

class Calculadora {

    var total: Double = 0.0
        private set

    fun registar(funcionario : Any){

        //val funcionarioNovo : Funcionario = funcionario as Funcionario
        //funcionario as Funcionario //equivalente

        if(funcionario is Funcionario) { //smart casting
            this.total += funcionario.bonificacao
        }
    }
}