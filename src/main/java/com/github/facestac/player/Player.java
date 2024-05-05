package com.github.facestac.player;


import com.github.facestac.player.shape.Shape;

public abstract class Player {
    private String name;
    private Shape shape;
    private int currentScore;
    private PlayerStatistics playerStatistics;

    Player() {
        this("UnknownPlayer");
    }

    Player(String name) {
        this.name = name;
        playerStatistics = new PlayerStatistics();
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

    public PlayerStatistics getPlayerStatistics() {
        return playerStatistics;
    }

    public void setPlayerStatistics(PlayerStatistics playerStatistics) {
        this.playerStatistics = playerStatistics;
    }

    public abstract Shape selectShape();
}
