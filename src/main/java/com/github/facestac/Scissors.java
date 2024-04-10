package com.github.facestac;

import static com.github.facestac.DefineShapes.*;

public class Scissors implements Shape{
    private final DefineShapes name = SCISSORS;

    private DefineShapes[] beats = {PAPER};


    public void printShape() {
        System.out.println(name);
    }
}
