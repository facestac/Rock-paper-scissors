package com.github.facestac;

public class Rock extends Shape {
    Rock(ShapeType name) {
        super(name);
        beatsList.add(ShapeType.SCISSORS);
    }
}
