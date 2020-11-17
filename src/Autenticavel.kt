/**
 * Não utilizar interfaces para dodos sensiveis. As variáveis ficam todas publicas.
 * Neste caso a senha fica acessivel
 */
interface Autenticavel {

    val senha: Int

    fun autenticar(senha : Int) : Boolean {
        return (this.senha == senha)
    }
}