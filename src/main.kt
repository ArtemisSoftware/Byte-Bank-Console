
fun main(){
    println("Bem vindo ao Bytebank")

    val contaYoga = Conta()
    contaYoga.titular = "Yoga"
    contaYoga.numero = 100
    contaYoga.saldo = 500.0

    println(contaYoga.titular)

    val contaShiryu = Conta()
    contaShiryu.titular = "Shiryu"
    contaYoga.numero = 200
    contaYoga.saldo = 1500.0

    println(contaShiryu.titular)

    val numeroX = 10
    var numeroY = numeroX
    ++numeroY
    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "João"

    var contaMaria = contaJoao;
    contaMaria.titular = "Maria"

    println("titular conta João: ${contaJoao.titular}")
    println("titular conta Maria: ${contaMaria.titular}")

}

class Conta{

    var titular = "Chaka"
    var numero = 0
    var saldo = 0.0

}

fun testaCondicoes(saldo : Double){

    when {
        saldo > 0.0 -> println("Saldo positivo")
        saldo == 0.0 ->  println("Saldo é 0")
        else ->  println("Saldo negativo")

    }
}