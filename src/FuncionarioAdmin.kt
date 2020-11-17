abstract class FuncionarioAdmin (nome : String, cpf : String, salario : Double, val  senha : Int) : Funcionario(nome, cpf, salario){

    fun autenticacar(senha : Int): Boolean {
        return (this.senha == senha)
    }

}