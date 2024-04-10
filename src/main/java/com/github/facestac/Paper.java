package com.github.facestac;

import static com.github.facestac.DefineShapes.*;

public class Paper implements Shape{
    private final DefineShapes name = PAPER;

    private DefineShapes[] beats = {ROCK};


    public void printShape() {
        System.out.println(name);
    }
}
