package com.github.facestac.player;

import com.github.facestac.player.shape.Shape;

import java.util.Random;

public class BotPlayer extends Player{
    private static final Random random = new Random();

    public BotPlayer(String name) {
        super(name);
    }

    @Override
    public Shape selectShape() {
        int randomValue = random.nextInt(Shape.values().length);
        return Shape.values()[randomValue];
    }
}
