package com.github.facestac.game;

import com.github.facestac.player.Player;
import com.github.facestac.player.shape.Shape;

import java.util.*;

public class Round {
    private final List<Player> players;
    private int roundNumber;

    Round(List<Player> players) {
        roundNumber = 1;
        this.players = players;
    }

    public Player playRoundAndGetWinner() {
        generateShapes();

        Player winner = getRoundWinner();

        printRoundInfo(winner);

        return winner;
    }

    private void generateShapes() {
        for (Player player : players) {
            Shape shape = player.selectShape();
            player.setShape(shape);
        }
    }

    private Player getRoundWinner() {
        GameReferee referee = new GameReferee();
        Player winner = referee.getWinners(players);

        if (winner != null) winner.setCurrentScore(winner.getCurrentScore() + 1);

        return winner;
    }

    private void printRoundInfo(Player winner) {
        System.out.println("\nROUND " + roundNumber++);
        for (Player player : players) {
            System.out.println(player.getName() + " : " + player.getShape());
        }
        printRoundWinner(winner);
        printScore();
    }

    private void printRoundWinner(Player winner) {
        if (winner == null) System.out.println("DRAW");
        else {
            System.out.println(winner.getName() + " WINS round!");
        }
    }

    private void printScore() {
        System.out.println("SCORE: ");
        for (Player player : players) {
            System.out.print(player.getName() + " : " + player.getCurrentScore() + "; ");
        }
        System.out.println();
    }
}
