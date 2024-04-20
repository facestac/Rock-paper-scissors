package com.github.facestac;

import java.util.ArrayList;

public abstract class Player {
    private String name;
    private Integer score = 0;
    private Shape shape;

    Player(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public boolean isWinsRound(ArrayList<Player> otherPLayers) {
        for (Player anotherPlayer : otherPLayers) {
            if (this.shape.isEqualsShape(anotherPlayer.shape)) continue;
            if (this.shape.isBeatsOtherShape(anotherPlayer.shape)) {
                return true;
            }
        }

        return false;
    }

    public abstract void drawShape();

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
