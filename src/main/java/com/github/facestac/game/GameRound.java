package com.github.facestac.game;

import com.github.facestac.factories.ShapeFactory;
import com.github.facestac.models.Player;
import com.github.facestac.models.Shape;

//import java.util.HashMap;
//import java.util.List;
import java.util.*;

public class GameRound {
    private Map<Player, Shape> players = new HashMap<>();

    GameRound(List<Player> players) {
        for (Player player : players) {
            this.players.put(player, selectShape(player));
        }

        printGameInfo();
    }

    public Map<Player, Shape> getPlayers() {
        return players;
    }

    private Shape selectShape(Player player) {
        return ShapeFactory.createShape(player.selectShape());
    }

    private void printGameInfo() {
        for (Map.Entry<Player, Shape> player : players.entrySet()) {
            System.out.println(player.getKey().getName() + " : " + player.getValue().getType());
        }
    }
}
