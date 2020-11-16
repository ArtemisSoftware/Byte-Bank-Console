
fun main(){
    println("Bem vindo ao Bytebank")

    val contaYoga = Conta(titular = "Yoga", numero = 100)
    contaYoga.deposita(500.0)

    println(contaYoga.titular)
    println(contaYoga.saldo)

    val contaShiryu = Conta(numero =  200, titular = "Shiryu")
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
