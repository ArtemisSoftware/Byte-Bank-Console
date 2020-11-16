
fun main(){
    println("Bem vindo ao Bytebank")

    val contaYoga = Conta(titular = "Yoga", numero = 100)

    val yoga = Funcionario("Yoga", "333.22.11.55", 2500.0)

    println("Nome: ${yoga.nome} bonificacao: ${yoga.bonificacao()}")
}
