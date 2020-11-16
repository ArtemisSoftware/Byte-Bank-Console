class Gerente (nome: String, cpf: String, salario : Double, val senha: Int) : Funcionario(nome, cpf, salario){

    override val bonificacao: Double
        get() {
            return super.bonificacao + salario
        }

    fun autenticacar(senha : Int): Boolean {
        return (this.senha == senha)
    }

}