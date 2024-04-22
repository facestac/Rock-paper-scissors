package com.github.facestac.factories;

import com.github.facestac.models.Shape;
import com.github.facestac.types.ShapeType;

import java.util.HashSet;
import java.util.List;

import static com.github.facestac.types.ShapeType.*;

public class ShapeFactory {
    public static Shape createShape(ShapeType type) {

        return switch(type) {
            case ROCK -> new Shape(ROCK, new HashSet<>(List.of(SCISSORS)));
            case PAPER -> new Shape(PAPER, new HashSet<>(List.of(ROCK)));
            case SCISSORS -> new Shape(SCISSORS, new HashSet<>(List.of(PAPER)));
        };
    }
}
