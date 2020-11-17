class SistemaInterno {

    fun iniciarSessao(admin: Autenticavel, senha : Int){
        if(admin.autenticar(senha) == true){
            println("Bem vindo ao Bytebank")
        }
        else{
            println("Erro na autenticação")
        }
    }

}