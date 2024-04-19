package com.github.facestac;

import java.util.ArrayList;

public abstract class Shape {
    private String name;
    private ArrayList<String> beatsList = new ArrayList<>();

    Shape(String name, ArrayList<String> beatsList) {
        this.name = name;
        this.beatsList = beatsList;
    }

    boolean isBeatsOtherShape(Shape other) {
        return beatsList.contains(other.name);
    }
}
