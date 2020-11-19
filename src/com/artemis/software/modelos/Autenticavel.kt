package com.artemis.software.modelos

/**
 * Não utilizar interfaces para dodos sensiveis. As variáveis ficam todas publicas.
 * Neste caso a senha fica acessivel
 */
interface Autenticavel {


    fun autenticar(senha : Int) : Boolean
}