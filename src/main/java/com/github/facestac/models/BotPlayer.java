package com.github.facestac.models;

import com.github.facestac.types.ShapeType;

import java.util.Random;

public class BotPlayer extends Player{
    private static final Random random = new Random();

    public BotPlayer() {
        super();
    }

    public BotPlayer(String name) {
        super(name);
    }

    @Override
    public ShapeType selectShape() {
        int randomValue = random.nextInt(ShapeType.values().length);
        return ShapeType.values()[randomValue];
    }
}
