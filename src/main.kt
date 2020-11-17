
fun main(){
    println("Bem vindo ao Bytebank")


    val contaCorrente = ContaCorrente("Saga", 1000)
    val contaPoupanca = ContaPoupanca("Seya", 1001)

    val shiryu = Gerente("Shiryu", "34534-5443.22", 1000.0, 1234)
    val ikki = Diretor("Ikki", "7766-444.33.2", 100000.0, 1234, 11.0)
    val yoga = Gerente("Yoga", "333.22.11.55", 2500.0, 1234)

    val calculadora = Calculadora()
    calculadora.registar(yoga);
    calculadora.registar(shiryu);
    calculadora.registar(ikki);

    println("Total da bonificação: ${calculadora.total}")


    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo poupanca: ${contaPoupanca.saldo}")

    contaCorrente.levantamento(100.0)
    contaPoupanca.levantamento(100.0)

    println("Após levantamento Saldo corrente: ${contaCorrente.saldo}")
    println("Após levantamento Saldo poupanca: ${contaPoupanca.saldo}")

    contaCorrente.transferir(100.0, contaPoupanca)

    println("Saldo corrente Após transferir para poupança: ${contaCorrente.saldo}")
    println("Saldo poupanca Após receber transferencia da conta corrente: ${contaPoupanca.saldo}")

    contaPoupanca.transferir(100.0, contaCorrente)

    println("Saldo poupança Após transferir para corrente: ${contaPoupanca.saldo}")
    println("Saldo corrente Após receber transferencia da conta poupança: ${contaCorrente.saldo}")
}
