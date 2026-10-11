package com.example.aidemo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    private final LocalAssistant assistant;

    public ChatController(LocalAssistant assistant) {
        this.assistant = assistant;
    }

    @PostMapping
    public String chat(@RequestBody String message) {
        return assistant.chat(message);
    }
}