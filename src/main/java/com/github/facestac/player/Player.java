package com.github.facestac.player;


import com.github.facestac.shape.Shape;

public abstract class Player {
    private int id;
    private String name;
    private Shape shape;
    private int currentScore;
    private PlayerGameStatistics gameStatistics;

    Player(int id) {
        this(id, "UnknownPlayer");
    }

    Player(int id, String name) {
        this.id = id;
        this.name = name;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public int getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }
}
