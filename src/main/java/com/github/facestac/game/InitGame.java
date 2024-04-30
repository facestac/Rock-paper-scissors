package com.github.facestac.game;

import com.github.facestac.models.BotPlayer;
import com.github.facestac.models.Player;

import java.util.ArrayList;
import java.util.List;

public class InitGame {
    private int countPlayers;
    private int maxScore;
    private List<Player> players;

    InitGame() {
        countPlayers = 2;
        maxScore = 3;
        players = addPlayersToGame();
    }

    public int getCountPlayers() {
        return countPlayers;
    }

    public void setCountPlayers(int countPlayers) {
        this.countPlayers = countPlayers;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }




    private List<Player> addPlayersToGame() {
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < countPlayers; i++) {
            players.add(new BotPlayer("Bot" + (i + 1)));
        }

        return players;
    }
}
