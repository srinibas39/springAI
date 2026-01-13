package com.example.springAI.services;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class OpenAIChatServices {

    
    private final ChatClient chatClient;

    public OpenAIChatServices(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    public String generateResponse(String prompt) {
        return chatClient.prompt(prompt).call().content();
    }

}
   
