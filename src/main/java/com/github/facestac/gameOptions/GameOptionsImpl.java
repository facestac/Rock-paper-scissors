package com.github.facestac.gameOptions;

import com.github.facestac.player.BotPlayer;
import com.github.facestac.player.Player;

import java.util.ArrayList;
import java.util.List;

public class GameOptionsImpl implements GameOptions{

    private int countOfPlayers;
    private int pointsForVictory;
    private List<Player> listOfPlayers ;

    public GameOptionsImpl() {
        listOfPlayers = new ArrayList<>();
        setDefaultGameOptions();
    }

    public void setDefaultGameOptions() {
        countOfPlayers = 2;
        pointsForVictory = 3;

        clearListOfPlayers();
        listOfPlayers.add(new BotPlayer("Bot1"));
        listOfPlayers.add(new BotPlayer("Bot2"));

        System.out.println("Game options are set by default");
    }

    public int getPointsForVictory() {
        return pointsForVictory;
    }

    public List<Player> getListOfPlayers() {
        return listOfPlayers;
    }

    private void clearListOfPlayers() {
        if (listOfPlayers == null) return;
        if (!listOfPlayers.isEmpty()) listOfPlayers.clear();
    }
}
