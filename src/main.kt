
fun main(){
    println("Bem vindo ao Bytebank")

    val contaYoga = Conta()
    contaYoga.titular = "Yoga"
    contaYoga.numero = 100
    contaYoga.deposita(500.0)

    println(contaYoga.titular)
    println(contaYoga.saldo)

    val contaShiryu = Conta()
    contaShiryu.titular = "Shiryu"
    contaYoga.numero = 200
    contaYoga.deposita(1500.0)

    println(contaShiryu.titular)
    println(contaShiryu.saldo)

    println("Depósito na conta do Yoga")
    contaYoga.deposita(50.0)
    println(contaYoga.saldo)

    println("Depósito na conta do Shiryu")
    contaShiryu.deposita(150.0)
    println(contaShiryu.saldo)

    println("Levantamento na conta do Yoga")
    contaYoga.levantamento(50.0)
    println(contaYoga.saldo)

    println("Transferencia do Yoga para o Shiryu")
    if(contaYoga.transferir(100.0, contaShiryu)){
        println("Transferencia realizada com sucesso")
    }
    else{
        println("Transferencia não realizada")
    }

    println(contaYoga.saldo)
    println(contaShiryu.saldo)

}



class Conta{

    var titular = "Chaka"
    var numero = 0
    var saldo = 0.0
        private set

    fun deposita(valor : Double){
        if(valor > 0) {
            this.saldo += valor
        }
    }

    fun levantamento(valor : Double){

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

//    fun getSaldo() : Double{
//        return saldo
//    }
//
//    fun setSaldo(valor: Double){
//        if(valor > 0) {
//            saldo = valor
//        }
//    }
}

fun testaCondicoes(saldo : Double){

    when {
        saldo > 0.0 -> println("Saldo positivo")
        saldo == 0.0 ->  println("Saldo é 0")
        else ->  println("Saldo negativo")

    }
}