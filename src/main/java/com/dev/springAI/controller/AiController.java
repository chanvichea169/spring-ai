package com.dev.springAI.controller;

import com.dev.springAI.dto.AiRequest;
import com.dev.springAI.dto.AiResponse;
import com.dev.springAI.sevice.AiService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ai")
public class AiController {

    private final AiService aiService;

    public AiController(AiService aiService) {
        this.aiService = aiService;
    }

    @PostMapping("/ask")
    public AiResponse askQuestion(@Valid @RequestBody AiRequest request) {
        String answer = aiService.generateAnswer(request.getQuestion());
        return new AiResponse(answer);
    }
}
