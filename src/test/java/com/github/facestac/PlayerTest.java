package com.github.facestac;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    private final Player player = new Player("Player's name");

    @Test
    @DisplayName("Изменяем количество очков игрока")
    void addScore() {
        player.addScore(1);
        assertEquals(1, player.getScore());

        player.addScore(2);
        assertEquals(3, player.getScore());

        player.addScore(-1);
        assertEquals(2, player.getScore());
    }

    @Test
    @DisplayName("Задаем фигуру для игрока")
    void setShape() {
        player.setShape(-1);
        assertNull(player.getShape());

        player.setShape(10);
        assertNull(player.getShape());

        player.setShape(0); // ROCK
        assertEquals(InitGameParameters.rock, player.getShape());

        player.setShape(1); // PAPER
        assertEquals(InitGameParameters.paper, player.getShape());

        player.setShape(2); // SCISSORS
        assertEquals(InitGameParameters.scissors, player.getShape());
    }

    @Test
    @DisplayName("")
    void isWinsAnother() {
    }

    @Test
    @DisplayName("")
    void getNumberOfBeaten() {
    }

    @Test
    @DisplayName("")
    void testToString() {
    }
}