package com.github.facestac.player;

import java.util.Random;

public class BotPlayer extends Player{
    private static final Random random = new Random();

    public BotPlayer(int id) {
        super(id);
    }

    public BotPlayer(int id, String name) {
        super(id, name);
    }

//    @Override
//    public ShapeType selectShape() {
//        int randomValue = random.nextInt(ShapeType.values().length);
//        return ShapeType.values()[randomValue];
//    }
}
