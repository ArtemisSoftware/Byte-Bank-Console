package com.artemis.software.exception

import java.lang.Exception


class SaldoInsuficienteException(mensagem : String = "Saldo insuficiente") : Exception(mensagem)