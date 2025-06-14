package org.example.controller;

import org.example.dto.AiResponse;
import org.example.dto.TextFromUser;
import org.example.tool.ToolExample;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Controller {

    ChatClient client;
    ToolExample toolExample;

    public Controller(ChatClient client, ToolExample toolExample) {
        this.client = client;
        this.toolExample = toolExample;
    }

    @PostMapping
    public ResponseEntity<AiResponse> send(@RequestBody TextFromUser prompt) {
        AiResponse entity = client.prompt()
                .user(prompt.getText())
                .tools(toolExample)
                .call()
                .entity(AiResponse.class);

        return ResponseEntity.ok(entity);
    }
}
