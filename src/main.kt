
fun main(){
    println("Bem vindo ao Bytebank")

    val titular = "Milo"
    val numeroConta = 23486
    var saldo = 0.0
    saldo = 100 + 2.0
    saldo += 200

    println("Titular $titular")
    println("Numero da conta $numeroConta")
    println("Saldo da conta $saldo")


    when {
        saldo > 0.0 -> println("Saldo positivo")
        saldo == 0.0 ->  println("Saldo é 0")
        else ->  println("Saldo negativo")

    }

}