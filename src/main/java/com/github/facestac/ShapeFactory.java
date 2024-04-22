package com.github.facestac;

import java.util.*;

import static com.github.facestac.ShapeType.*;

public class ShapeFactory {
    public Shape createShape (ShapeType type) {

        return switch(type) {
            case ROCK -> new Rock(type, new HashSet<>(List.of(SCISSORS)));
            case PAPER -> new Paper(type,  new HashSet<>(List.of(ROCK)));
            case SCISSORS -> new Scissors(type, new HashSet<>(List.of(PAPER)));
        };
    }
}
