
fun main(){
    println("Bem vindo ao Bytebank")

    for(i in 1..5 step 1) {

        if(i == 2){
            continue
        }

        val titular = "Milo $i"
        val numeroConta = 2000 + i
        var saldo =  i + 2.0

        println("Titular $titular")
        println("Numero da conta $numeroConta")
        println("Saldo da conta $saldo")

        testaCondicoes(saldo)
        println()
    }

}

fun testaCondicoes(saldo : Double){

    when {
        saldo > 0.0 -> println("Saldo positivo")
        saldo == 0.0 ->  println("Saldo é 0")
        else ->  println("Saldo negativo")

    }
}