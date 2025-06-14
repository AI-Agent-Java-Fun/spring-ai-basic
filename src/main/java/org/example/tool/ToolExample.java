package org.example.tool;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Component;

@Component
public class ToolExample {

    @Tool(description = "Инструмент для бросание игральных кубиков, который возвращает сумму выпавших очков")
    String diceRollingTool(@ToolParam(description = "How many dice to roll") Integer count) {
        return "5";
    }
}
