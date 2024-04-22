package com.github.facestac.game;

import com.github.facestac.models.BotPlayer;
import com.github.facestac.models.Player;

import java.util.ArrayList;
import java.util.List;

public class InitGameParameters {
    static final int COUNT_PLAYERS = 2;

    public List<Player> addPlayersToGame() {
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < COUNT_PLAYERS; i++) {
            players.add(new BotPlayer("Bot" + (i + 1)));
        }

        return players;
    }
}
