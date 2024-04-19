package com.github.facestac;

public abstract class Player {
    private final String name;
    private Integer score = 0;

    Player(String name) {
        this.name = name;
    }

    public abstract String drawShape() {

    }
}
