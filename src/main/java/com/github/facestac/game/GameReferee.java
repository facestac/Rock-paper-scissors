package com.github.facestac.game;

import com.github.facestac.player.Player;
import java.util.*;

public class GameReferee {

    public Player getWinners(List<Player> players) {
        for (Player player : players) {
            for (Player otherPlayer : players)  {
                if (player.getShape().isBeats(otherPlayer.getShape())) {
                    return player;
                }
            }
        }

        return null;
    }
}
