package com.github.facestac;

import java.util.Random;

public class PlayerBot extends Player {
    PlayerBot(String name) {
        super(name);
    }

    @Override
    public Shape drawShape() {
        Random rand = new Random();
        int index = rand.nextInt(ShapeType.values().length);

        ShapeFactory shapeFactory = new ShapeFactory();
        ShapeType shapeType = ShapeType.values()[index];

        return shapeFactory.createShape(shapeType);
    }
}
