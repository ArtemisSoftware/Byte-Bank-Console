
fun main(){
    println("Bem vindo ao Bytebank")

    val contaYoga = Conta(titular = "Yoga", numero = 100)

    val yoga = Funcionario("Yoga", "333.22.11.55", 2500.0)

    println("Nome: ${yoga.nome} bonificacao: ${yoga.bonificacao}")

    val shiryu = Gerente("Shiryu", "34534-5443.22", 1000.0, 1234)

    println("Nome: ${shiryu.nome} bonificacao: ${shiryu.bonificacao}")

    if(shiryu.autenticacar(1234) == true){
        println("Autenticação realizada com sucesso")
    }
    else{
        println("Erro na autenticação")
    }

    val ikki = Diretor("Ikki", "7766-444.33.2", 100000.0, 1234, 11.0)
    println("Nome: ${ikki.nome} bonificacao: ${ikki.bonificacao}")
}
