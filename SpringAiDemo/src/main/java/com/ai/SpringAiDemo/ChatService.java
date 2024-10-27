package com.ai.SpringAiDemo;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.stereotype.Service;

@Service
public class ChatService {
    private final ChatModel chatModel;

    public ChatService(ChatModel chatModel) {
        this.chatModel = chatModel;
    }
    public String getResponse(String prompt){
        return chatModel.call(prompt);
    }
    public String getResponseOptions(String prompt){
        ChatResponse response = chatModel.call(
                new Prompt(
                        prompt,
                        OpenAiChatOptions.builder()
                                .withModel("gpt-4o")
                                .withTemperature(0.4) //Value closer to 1 gives random/creative responses. Value closer to 0 gives conservative responses
                                .build()
                ));
        return response.getResult().getOutput().getContent();
    }
}
