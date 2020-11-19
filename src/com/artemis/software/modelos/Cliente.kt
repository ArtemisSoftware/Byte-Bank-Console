package com.artemis.software.modelos

class Cliente (val nome : String, val cpf : String, val endereco: Endereco, private val senha: Int) :
    Autenticavel {
    override fun autenticar(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }


}