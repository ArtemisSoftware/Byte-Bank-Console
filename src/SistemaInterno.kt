class SistemaInterno {

    fun iniciarSessao(admin: FuncionarioAdmin, senha : Int){
        if(admin.autenticacar(senha) == true){
            println("Bem vindo ao Bytebank")
        }
        else{
            println("Erro na autenticação")
        }
    }

}