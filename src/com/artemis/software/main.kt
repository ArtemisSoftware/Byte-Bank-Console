package com.artemis.software

import com.artemis.software.modelos.*



fun main(){

    val shiryu = Gerente("Shiryu", "34534-5443.22", 1000.0, 1234)
    val ikki = Diretor("Ikki", "7766-444.33.2", 100000.0, 1234, 11.0)
    val yoga = Gerente("Yoga", "333.22.11.55", 2500.0, 1234)
    val joao = Cliente("joao", "222-444.232", Endereco(), 4321)
    val maria = Cliente("maria", "222-444.232", Endereco(),4321)

    val contaJoao = ContaCorrente(joao, 1000)
    val contaPoupanca = ContaPoupanca(maria, 1001)

    println("Nome do titular da conta: ${contaJoao.titular.nome}")
    println("Endereço do titular da conta: ${contaJoao.titular.endereco.cidade}")

    val sistemaInterno = SistemaInterno()

    sistemaInterno.iniciarSessao(shiryu, 1234)
    sistemaInterno.iniciarSessao(joao, 1234)

    println("Total de contas: ${Conta.total}")

}

fun imprime(valor: Any){

}