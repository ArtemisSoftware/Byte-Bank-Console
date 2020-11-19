package com.artemis.software.exception

import java.lang.Exception


class FalhaAutenticacaoException(mensagem : String = "Falha na autenticacao") : Exception(mensagem)