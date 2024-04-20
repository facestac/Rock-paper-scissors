package com.github.facestac;

import java.util.ArrayList;

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

    public boolean isEqualsShape(Shape another) {
        return this.name == another.name;
    }

    public boolean isBeatsOtherShape(Shape another) {
        return beatsList.contains(another.name);
    }
}
