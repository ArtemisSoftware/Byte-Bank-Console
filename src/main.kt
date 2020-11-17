
fun main(){


    val contaCorrente = ContaCorrente("Saga", 1000)
    val contaPoupanca = ContaPoupanca("Seya", 1001)

    val shiryu = Gerente("Shiryu", "34534-5443.22", 1000.0, 1234)
    val ikki = Diretor("Ikki", "7766-444.33.2", 100000.0, 1234, 11.0)
    val yoga = Gerente("Yoga", "333.22.11.55", 2500.0, 1234)

    val sistemaInterno = SistemaInterno()

    sistemaInterno.iniciarSessao(shiryu, 1234)
}
