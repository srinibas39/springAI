package com.example.springAI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(excludeName = {
	"org.springframework.ai.model.anthropic.autoconfigure.AnthropicChatAutoConfiguration",
	"org.springframework.ai.model.openai.autoconfigure.OpenAiChatAutoConfiguration",
	// "org.springframework.ai.model.google.genai.autoconfigure.chat.GoogleGenAiChatAutoConfiguration"
})
public class SpringAiApplication {

	public static void main(String[] args) {
		System.out.println("Spring AI Application is starting...");
		SpringApplication.run(SpringAiApplication.class, args);
	}

}
