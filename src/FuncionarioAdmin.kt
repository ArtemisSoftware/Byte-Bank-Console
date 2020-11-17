abstract class FuncionarioAdmin (val nome : String, val cpf : String, val salario : Double, val  senha : Int){

    abstract val bonificacao: Double

    fun autenticacar(senha : Int): Boolean {
        return (this.senha == senha)
    }

}