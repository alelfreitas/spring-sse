package dev.alexandrelfreitas.springwebsocket.controller

import dev.alexandrelfreitas.springwebsocket.model.Mensagem
import dev.alexandrelfreitas.springwebsocket.model.MensagemBarramento
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.stereotype.Controller

@Controller
class MonitorController {

    private val LOG by lazy { LoggerFactory.getLogger(MonitorController::class.java) }

    @MessageMapping("/olha")
    @SendTo("/app/viu")
    fun ping(mensagem: Mensagem) : Mensagem {
        LOG.info("Chegou mensagem! -> {}", mensagem)
        val retorno = Mensagem (
                conteudo="OI"
        )
        return retorno
        }


}