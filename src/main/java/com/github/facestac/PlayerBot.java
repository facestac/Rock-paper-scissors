package com.github.facestac;

import java.util.Random;

public class PlayerBot extends Player{
    PlayerBot(String name) {
        super(name);
    }

    public void drawShape() {
        Random rand = new Random();

        int randValue = rand.nextInt(ShapeType.values().length);
        ShapeType type = ShapeType.values()[randValue];

//        return ShapeFactory.createShape(type);
        this.setShape(ShapeFactory.createShape(type));
    }
}
