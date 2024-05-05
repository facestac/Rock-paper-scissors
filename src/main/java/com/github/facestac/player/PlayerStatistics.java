package com.github.facestac.player;

public class PlayerStatistics {
    private int totalGames = 0;
    private int totalWins = 0;


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

    @Override
    public String toString() {
        return "totalGames = " + totalGames +
                ", totalWins = " + totalWins;
    }
}
