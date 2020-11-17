class Calculadora {

    var total: Double = 0.0
        private set

    fun registar(funcionario : Funcionario){
        this.total += funcionario.bonificacao
    }
}