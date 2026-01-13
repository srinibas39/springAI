package com.example.springAI.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springAI.services.OpenAIChatServices;

@RestController
@RequestMapping("/api/v1/chat")
public class OpenAIChatController {
    private final OpenAIChatServices openAIChatServices;

    public OpenAIChatController(OpenAIChatServices openAIChatServices) {
        this.openAIChatServices = openAIChatServices;
    }

    @PostMapping("/generate")
    public String generateResponse(@RequestBody String prompt) {
        System.out.println("Generating response for prompt: " + prompt);
        String response = openAIChatServices.generateResponse(prompt);
        System.out.println("Response: " + response);
        return response;
    }

}
