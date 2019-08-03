package dev.alexandrelfreitas.springwebsocket.model

data class MensagemBarramento<T>(
        val type: String,
        val data: T? = null,
        val replyTo: String = "NO_REPLY",
        val oldType: String? = null,
        val idSolicitacao: String? = null
)