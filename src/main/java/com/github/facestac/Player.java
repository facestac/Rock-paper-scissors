package com.github.facestac;

import java.util.ArrayList;

public abstract class Player {
    private final String name;
    private Integer score = 0;
    private Shape shape;

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getScore() {
        return score;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public boolean isWonSomeone(ArrayList<Player> otherList) {
        for (Player other: otherList) {
            if (shape.isEqualsShape(other.shape)) continue;
            if (shape.isBeatsOtherShape(other.shape)) return true;
         }
        return false;
    }

    public abstract Shape drawShape();

}
