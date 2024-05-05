package com.github.facestac.gameOptions;

import com.github.facestac.player.Player;

import java.util.List;

public interface GameOptions {

    void setDefaultGameOptions();

    int getPointsForVictory();

    List<Player> getListOfPlayers();
}
