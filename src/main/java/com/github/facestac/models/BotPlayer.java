package com.github.facestac.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.facestac.types.ShapeType;
import java.util.Random;

public class BotPlayer extends Player{
    private static final Random random = new Random();

    public BotPlayer(int id) {
        super(id);
    }

    public BotPlayer(int id, String name) {
        super(id, name);
    }

    public BotPlayer(int id, String name, int totalGames, int totalWins) {
        super(id, name, totalGames, totalWins);
    }

    @Override
    public ShapeType selectShape() {
        int randomValue = random.nextInt(ShapeType.values().length);
        return ShapeType.values()[randomValue];
    }
}
