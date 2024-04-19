package com.github.facestac;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
    private ShapeType name;
    protected ArrayList<ShapeType> beatsList;

    Shape(ShapeType name) {
        this.name = name;
        beatsList = new ArrayList<>();
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
