package com.github.facestac.player;

public class PlayerView {
    private String name;
    private PlayerStatistics playerStatistics;

    public PlayerView(String name, PlayerStatistics playerStatistics) {
        this.name = name;
        this.playerStatistics = playerStatistics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerStatistics getPlayerStatistics() {
        return playerStatistics;
    }

    public void setPlayerStatistics(PlayerStatistics playerStatistics) {
        this.playerStatistics = playerStatistics;
    }

    @Override
    public String toString() {
        return name + ": {"
                + playerStatistics +
                "}";
    }
}
