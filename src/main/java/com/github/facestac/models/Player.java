package com.github.facestac.models;

import com.github.facestac.types.ShapeType;

public abstract class Player {
    private String name;

    public Player() {
        this("UnknownPlayer");
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract ShapeType selectShape();
}
