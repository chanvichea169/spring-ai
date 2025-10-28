package com.dev.springAI.sevice;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class AiService {

    private final ChatClient chatClient;

    public AiService(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    public String generateAnswer(String question) {
        return chatClient.prompt()
                .user(question)
                .call()
                .content();
    }
}
