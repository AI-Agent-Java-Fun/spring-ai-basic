package org.example.tool;

import org.example.dto.DiceRollingParam;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Component;

@Component
public class ToolExample {

    @Tool(description = "Инструмент для бросание игральных кубиков, который возвращает сумму выпавших очков")
    String diceRollingTool(@ToolParam(description = "specify the number of dice to roll. Specify it in json format with the count field.") DiceRollingParam diceRollingParam) {
        System.out.println(diceRollingParam.getCount());
        return "5";
    }
}
