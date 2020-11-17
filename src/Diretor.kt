class Diretor (nome: String, cpf: String, salario : Double, senha: Int, val plr : Double) : FuncionarioAdmin(nome, cpf, salario, senha), Autenticavel{

    override val bonificacao: Double
        get() {
            return salario + plr
        }

    override fun autenticar(senha: Int): Boolean {
        return super<FuncionarioAdmin>.autenticar(senha)
    }


}