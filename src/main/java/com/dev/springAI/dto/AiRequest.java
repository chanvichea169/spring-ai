package com.dev.springAI.dto;

import jakarta.validation.constraints.NotBlank;

public class AiRequest {

    @NotBlank(message = "Question must not be empty.")
    private String question;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
