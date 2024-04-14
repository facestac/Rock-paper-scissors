package com.github.facestac;

public class Shape {
    private ShapesEnum name;
    private ShapesEnum[] beatsList;
    private ShapesEnum[] drawsList;
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

    public ShapesEnum[] getDrawsList() {
        return drawsList;
    }

    public void setDrawsList(ShapesEnum[] drawsList) {
        this.drawsList = drawsList;
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
