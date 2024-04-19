package com.github.facestac;

import java.util.ArrayList;

public class Game {
    private Integer maxScore = 3;



    public static void main(String[] args){
        Game game = new Game();
        ArrayList<Player> players = game.createPlayers(2);
        game.drawShapes(players);

        for (Player player : players) {
            System.out.println(player.getName() + " : " + player.getShape().getName());
            if (player.isWonSomeone(players)) player.setScore(player.getScore() + 1);
        }

        game.printWinner(players);
    }


    private ArrayList<Player> createPlayers(int playersCount) {
        ArrayList<Player> players = new ArrayList<>();

        for (int i = 0; i < playersCount; i++) {
            Player player = new PlayerBot("Bot" + (i + 1));
            players.add(player);
        }

        return players;
    }

    private void drawShapes(ArrayList<Player> players) {
        for (Player player : players) {
            player.setShape(player.drawShape());
//            System.out.println(player.getShape().getName());
        }
    }

    private void printWinner(ArrayList<Player> players) {
        boolean isThereWinner = false;
        for (Player player : players) {
            if (player.getScore() == 1) {
                System.out.println(player.getName() + " WINS");
                isThereWinner = true;
            }
        }

        if (!isThereWinner) System.out.println("DRAW");
    }
}
