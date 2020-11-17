open class Conta(var titular: String, val numero: Int) {

    var saldo = 0.0
        private set

    fun deposita(valor : Double){
        if(valor > 0) {
            this.saldo += valor
        }
    }

    open fun levantamento(valor : Double){

        if(saldo >= valor){
            this.saldo -= valor
        }
    }

    fun transferir(valor : Double, contaDestino : Conta): Boolean {
        if(saldo >= valor){
            saldo -= valor
            contaDestino.deposita(valor)
            return true
        }
        else{
            return false
        }
    }

}