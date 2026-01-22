package com.example.springAI.services;

import java.util.Map;

import org.springframework.web.client.RestTemplate;

import com.google.api.client.util.Value;

public class LlamaService {

    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${llama.url}")
    private String url;


    @Value("${llama.model}")
    private String model;

    public String ask(String prompt) {

        Map<String , Object> request = Map.of("prompt" , prompt , "model" , model , "stream" , false);
    
        Map<String , Object> response = restTemplate.postForObject(url , request , Map.class);

        return response.get("response").toString();
    }

    
}
