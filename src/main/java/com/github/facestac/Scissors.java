package com.github.facestac;

import java.util.Set;

public class Scissors extends Shape {
    Scissors(ShapeType name) {
        super(name);
//        beatsList.add(ShapeType.PAPER);
    }

    public Scissors(ShapeType name, Set<ShapeType> beatsList) {
        super(name, beatsList);
    }
}
