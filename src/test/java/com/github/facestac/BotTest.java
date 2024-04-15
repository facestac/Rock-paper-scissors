package com.github.facestac;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BotTest extends Player {

    private Player bot = new Bot("Bot's name");

    BotTest(String name) {
        super(name);
    }

    @Test
    @DisplayName("Задаем фигуру для игрока")
    void testGetShapeNumber() {

    }
}