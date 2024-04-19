package com.github.facestac;

import java.util.ArrayList;

public class Game {


    public static void main(String[] args){
        Game game = new Game();
        ArrayList<Player> players = game.createPlayers(2);

        for (Player player : players) {
            System.out.println(player.getName());
        }

    }


    private ArrayList<Player> createPlayers(int playersCount) {
        ArrayList<Player> players = new ArrayList<>();

        for (int i = 0; i < playersCount; i++) {
            Player player = new PlayerBot("Bot" + i);
            players.add(player);
        }

        return players;
    }
}
