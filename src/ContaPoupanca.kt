class ContaPoupanca(titular: String, numero: Int): Conta(titular, numero) {

    override fun levantamento(valor: Double) {
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }
}