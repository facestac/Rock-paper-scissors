package com.github.facestac;

import java.util.Set;

public class Paper extends Shape {
    Paper(ShapeType name) {
        super(name);
//        beatsList.add(ShapeType.ROCK);
    }

    public Paper(ShapeType name, Set<ShapeType> beatsList) {
        super(name, beatsList);
    }
}
