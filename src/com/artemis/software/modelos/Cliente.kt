package com.artemis.software.modelos

class Cliente (val nome : String, val cpf : String, val endereco: Endereco, override val senha : Int) :
    Autenticavel {



}