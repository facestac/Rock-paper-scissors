package com.github.facestac;

import java.util.HashSet;
//import java.util.List;
import java.util.Set;

public abstract class Shape {
    private ShapeType name;
    protected Set<ShapeType> beatsList;

    Shape(ShapeType name) {
        this.name = name;
        beatsList = new HashSet<>();
    }

    Shape(ShapeType name, Set<ShapeType> beatsList) {
        this.name = name;
        this.beatsList = beatsList;
    }

    public ShapeType getName() {
        return name;
    }

    public boolean isEqualsShape(Shape other) {
        return name == other.name;
    }

    public boolean isBeatsOtherShape(Shape other) {
        return beatsList.contains(other.name);
    }
}
