class Diretor (nome: String, cpf: String, salario : Double, val senha: Int, val plr : Double) : Funcionario(nome, cpf, salario){

    override val bonificacao: Double
        get() {
            return salario * 0.3
        }

    fun autenticacar(senha : Int): Boolean {
        return (this.senha == senha)
    }

}