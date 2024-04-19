package com.github.facestac;

public abstract class Player {
    private final String name;
    private Integer score = 0;

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

    public abstract String drawShape();
}
