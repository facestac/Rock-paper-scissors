package com.github.facestac;

import java.util.ArrayList;

public class Game {

    private final int maxScore = 3;

    public static void main(String[] args){
        Game game = new Game();
        ArrayList<Player> players = game.createPlayers(2);
        boolean isGameOver = false;
        Player winner = null;

        while (!isGameOver) {
            game.drawShapes(players);
            game.printRoundInfo(players);

            winner = game.getRoundWinner(players);

            if (winner == null) {
                System.out.println("DRAW");
            }
            else {
                System.out.println(winner.getName() + " WINS ROUND\n");
                if (winner.getScore() == game.maxScore) isGameOver = true;
            }

        }

        System.out.println("GAME OVER. FINAL SCORE:");
        for (Player player : players) {
            System.out.println(player.getName() + " score: " + player.getScore());
        }
        System.out.println(winner.getName() + " WINS GAME");

    }

    private ArrayList<Player> createPlayers(int countPlayers) {
        ArrayList<Player> players = new ArrayList<>();

        for (int i = 0; i < countPlayers; i++) {
            Player player = new PlayerBot("Bot" + (i + 1));
            players.add(player);
        }

        return players;
    }

    private void drawShapes(ArrayList<Player>  players) {
        for (Player player : players) {
            player.drawShape();
        }
    }

    private void printRoundInfo(ArrayList<Player>  players) {
        for (Player player : players) {
            System.out.println(player.getName()+"("+player.getScore()+") : " + player.getShape().getName());
        }
    }

    private Player getRoundWinner(ArrayList<Player>  players) {
        Player winner = null;
        for (Player player : players) {
            if (player.isWinsRound(players)) {
                winner = player;
                winner.setScore(winner.getScore() + 1);
                break;
            }
        }
        return winner;
    }
}
