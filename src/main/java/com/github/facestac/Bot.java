package com.github.facestac;

import java.util.Random;

public class Bot extends Player{
    Bot() {
        super();
    }


    protected String getShapeNumber() {
        Random r = new Random();
        int shapesCount = ShapesEnum.values().length;

        return String.valueOf(r.nextInt(shapesCount) + 1);
    }

}
