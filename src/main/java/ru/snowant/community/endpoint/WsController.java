package ru.snowant.community.endpoint;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import ru.snowant.community.model.Warrior;

@Controller
public class WsController {

    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/public")
    public Warrior sendMessage(@Payload Warrior chatMessage) {
        return chatMessage;
    }
}
