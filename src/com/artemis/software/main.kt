package com.artemis.software

import com.artemis.software.exception.FalhaAutenticacaoException
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
    catch (e : FalhaAutenticacaoException){
        println("Erro na autenticacao")
        e.printStackTrace()
    }
    catch (e : Exception){
        println("Erro generico")
        e.printStackTrace()
    }

    var enderecoNulo: Endereco? = null
    println(enderecoNulo?.logradouro?.length)

    enderecoNulo = null
    enderecoNulo?.let {
        println("enderecoNulo?.logradouro it-: ${it.logradouro.length}")

    }

    var enderecoNaoNulo= Endereco(logradouro = "o meu", complemento = "longo")
    println(enderecoNaoNulo.logradouro.length)

    enderecoNaoNulo.let {
        println("enderecoNaoNulo it: ${it}")

        val tamanhoComplemento: Int = it.complemento?.length ?: throw  IllegalArgumentException("Complemento Não pode ser vazio")

        println("tamanhoComplemento: ${tamanhoComplemento}")

    }

    println("fim!!")
}
