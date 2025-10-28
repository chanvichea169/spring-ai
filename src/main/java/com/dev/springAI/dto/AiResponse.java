package com.dev.springAI.dto;

public class AiResponse {
    private String answer;

    public AiResponse(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }
}
