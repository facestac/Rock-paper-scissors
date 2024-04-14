package com.github.facestac;

public class Shape {
    private final ShapesEnum name;
    private ShapesEnum[] beatsList;
    private ShapesEnum[] losesList;

    Shape(ShapesEnum name) {
        this.name = name;
    }
    public ShapesEnum[] getBeatsList() {
        return beatsList;
    }

    public void setBeatsList(ShapesEnum[] beatsList) {
        this.beatsList = beatsList;
    }

    public ShapesEnum[] getLosesList() {
        return losesList;
    }

    public void setLosesList(ShapesEnum[] losesList) {
        this.losesList = losesList;
    }

    public ShapesEnum getName() {
        return name;
    }
}
