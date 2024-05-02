package com.github.facestac.game;

import com.github.facestac.models.Player;
import java.util.*;

public class GameJudge {

    public Player getWinners(List<Player> players) {
        for (Player player : players) {
            for (Player otherPlayer : players) {
                if (player.getShape().isBeats(otherPlayer.getShape())) {
                    return player;
                }
            }
        }

        return null;
    }
}
