package com.github.facestac;

public class ShapeFactory {
    public Shape createShape (ShapeType type) {

        return switch(type) {
            case ROCK -> new Rock(type);
            case PAPER -> new Paper(type);
            case SCISSORS -> new Scissors(type);
        };
    }
}
