package org.example.conf;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public ChatClient chatClient(ChatClient.Builder builder) {
        return builder
                .defaultSystem("""
                        Твоя задача общаться с пользователем.
                        Если пользователь попросит тебя бросить кубик, то ты должен вызвать инструмент diceRollingTool,
                        при вызове передай число кубиков, которые пользователь попросит кинуть.
                        Скажи число, которое вернулось при вызове этого инструмента. Ничего не выдумывай самостоятельно
                        """)
                .defaultAdvisors(new SimpleLoggerAdvisor())
                .build();
    }
}
