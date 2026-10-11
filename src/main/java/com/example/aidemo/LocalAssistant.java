package com.example.aidemo;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface LocalAssistant {

    @SystemMessage("You are a highly skilled, witty software engineer. Answer questions clearly and keep it under 2 sentences.")
    String chat(String userMessage);
}