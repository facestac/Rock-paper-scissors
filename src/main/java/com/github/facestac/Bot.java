package com.github.facestac;

import java.util.Random;

public class Bot extends Player{
    Bot(String name) {
        super(name);
    }

    @Override
    protected String getShapeNumber()  {
        Random r = new Random();
        int shapesCount = ShapesEnum.values().length;

        return String.valueOf(r.nextInt(shapesCount) + 1);
    }

}
