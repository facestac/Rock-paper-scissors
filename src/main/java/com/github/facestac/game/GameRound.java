package com.github.facestac.game;

import com.github.facestac.factories.ShapeFactory;
import com.github.facestac.models.Player;
import com.github.facestac.models.Shape;
import com.github.facestac.types.ShapeType;
import java.util.*;

public class GameRound {
    private List<Player> players;
    private int roundNumber = 1;

    GameRound(List<Player> players) {
        this.players = players;
    }

    public Player playRound() {
        generateShapes();

        GameJudge judge = new GameJudge();
        Player winner = judge.getWinners(players);
        if (winner != null) winner.setCurrentScore(winner.getCurrentScore() + 1);

        printRoundInfo(winner);

        return winner;
    }

    private void generateShapes() {
        for (Player player : players) {
            ShapeType type = player.selectShape();
            Shape shape = ShapeFactory.createShape(type);
            player.setShape(shape);
        }
    }

    private void printRoundInfo(Player winner) {
        System.out.println("\nROUND " + roundNumber++);
        for (Player player : players) {
            System.out.println(player.getName() + " : " + player.getShape().getType());
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
