package com.github.facestac;

public class Paper extends Shape {
    Paper(ShapeType name) {
        super(name);
        beatsList.add(ShapeType.ROCK);
    }
}
