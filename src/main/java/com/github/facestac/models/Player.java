package com.github.facestac.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.facestac.types.ShapeType;

public abstract class Player {
    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
    @JsonIgnore
    private Shape shape;
    @JsonProperty("totalGames")
    private int totalGames;
    @JsonProperty("totalWins")
    private int totalWins;
    @JsonIgnore
    private int currentScore;

    Player(int id) {
        this(id, "UnknownPlayer");
    }
    Player(int id, String name) {
        this(id, name, 0, 0);
    }
    Player(int id, String name, int totalGames, int totalWins) {
        this.id = id;
        this.name = name;
        this.totalGames = totalGames;
        this.totalWins = totalWins;
    }

    public int getTotalWins() {
        return totalWins;
    }

    public void setTotalWins(int totalWins) {
        this.totalWins = totalWins;
    }

    public int getTotalGames() {
        return totalGames;
    }

    public void setTotalGames(int totalGames) {
        this.totalGames = totalGames;
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

    public abstract ShapeType selectShape();

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
