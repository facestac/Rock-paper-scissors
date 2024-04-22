package com.github.facestac.models;

import com.github.facestac.types.ShapeType;

import java.util.Set;

public class Shape {
    private ShapeType type;
    private Set<ShapeType> beatsList;

    public Shape(ShapeType type, Set<ShapeType> beatsList) {
        this.type = type;
        this.beatsList = beatsList;
    }

}
