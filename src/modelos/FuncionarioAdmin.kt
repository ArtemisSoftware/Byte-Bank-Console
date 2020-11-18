package modelos

import modelos.Funcionario

abstract class FuncionarioAdmin (nome : String, cpf : String, salario : Double, val  senha : Int) : Funcionario(nome, cpf, salario){

    open fun autenticar(senha : Int): Boolean {
        return (this.senha == senha)
    }

}