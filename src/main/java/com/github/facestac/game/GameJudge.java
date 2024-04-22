package com.github.facestac.game;

import com.github.facestac.models.Player;
import com.github.facestac.models.Shape;

import java.util.*;

public class GameJudge {
    private Map<Player, Integer> scores = new HashMap<>();;
    
    public GameJudge(List<Player> players) {
        for (Player player : players) {
            scores.put(player, 0);
        }
    }

    public Player getWinners(Map<Player, Shape> players) {
        Player winner = null;

        for (Map.Entry<Player, Shape> player : players.entrySet()) {
            players.forEach((key, value) ->
                player.getValue().isBeats(value));
        }

        return winner;
    }

//    private Player isWinner(Map<Player, Shape> players) {
//
//    }
}
