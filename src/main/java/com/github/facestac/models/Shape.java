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

    public ShapeType getType() {
        return type;
    }

    public boolean isBeats(Shape another) {
        if (isSameShape(another)) return false;

        return this.beatsList.contains(another.getType());
    }

    private boolean isSameShape(Shape another) {
        return this.type == another.type;
    }
}
