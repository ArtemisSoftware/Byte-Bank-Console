class Gerente (nome: String, cpf: String, salario : Double, val senha: Int) : Funcionario(nome, cpf, salario){

//    fun bonificacao(): Double {
//        return salario * 0.2
//    }

    fun autenticacar(senha : Int): Boolean {
        return (this.senha == senha)
    }

}