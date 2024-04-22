package com.github.facestac;

import java.util.HashSet;
import java.util.Set;

public class Rock extends Shape {
    Rock(ShapeType name) {
        super(name);
//        beatsList.add(ShapeType.SCISSORS);
    }

    public Rock(ShapeType name, Set<ShapeType> beatsList) {
        super(name, beatsList);
    }
}
