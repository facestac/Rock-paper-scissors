package com.github.facestac;

import static com.github.facestac.DefineShapes.*;

public class Rock implements Shape{
    private final DefineShapes name = ROCK;

    private DefineShapes[] beats = {SCISSORS};


    public void printShape() {
        System.out.println(name);
    }
}
