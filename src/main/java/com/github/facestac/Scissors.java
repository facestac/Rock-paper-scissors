package com.github.facestac;

public class Scissors extends Shape {
    Scissors(ShapeType name) {
        super(name);
        beatsList.add(ShapeType.PAPER);
    }
}
