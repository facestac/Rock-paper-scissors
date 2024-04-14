package com.github.facestac;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class GameProcess {
    static private int highScore;

    static public void gameInit() {
        Scanner sc = new Scanner(System.in);

        do {
            String mode = selectGameMode();
            highScore = setNumberOfPoints();


            if (mode.equals("1")) gameLoop(new Player("Player"), new Bot("Bot"));
            else gameLoop(new Bot("Bot1"), new Bot("Bot2"));

            System.out.println("Start a new game? (y/n)");
        } while (!sc.next().matches("[nN]"));
    }

//    static private List<Player> setPlayers(int mode) {
//        List<Player> players = new ArrayList<>();
//
//        for (int i = 0; i < 2; i++) {
//            Player player =
//        }
//        player1 = mode == 1 ? new Player("Player") : new Bot("Bot");
//        players.add(mode == 1 ? )
//        return players;
//    }

    static private String selectGameMode() {
        System.out.println("Select game mode:");
        System.out.println("1 - Player vs Bot");
        System.out.println("2 - Bot vs Bot");

        Scanner sc = new Scanner(System.in);
        String mode;

        do {
            mode = sc.next();
            if (mode.matches("[12]")) break;
            else System.out.println("Wrong input. Try again.");
        } while (true);

        return mode;
    }

    static private int setNumberOfPoints() {
        System.out.printf("Input the number of points to win (from 1 to %d)%n", InitGameParameters.MAX_SCORE);
        Scanner sc = new Scanner(System.in);
        int numberOfPoints;

        do {
            if (!sc.hasNextInt()) {
                System.out.println("Not an integer. Try again.");
            } else {
                numberOfPoints = sc.nextInt();
                if (numberOfPoints > 0 && numberOfPoints <= InitGameParameters.MAX_SCORE) break;
                else System.out.println("Not in range. Try again.");
            }
        } while (true);

        return numberOfPoints;
    }

    static private void gameLoop(Player player1, Player player2) {
        int round = 0;

        while (player1.getScore() < highScore && player2.getScore() < highScore) {
            System.out.println("Round: " + ++round);

            player1.setShape();
            player2.setShape();

            printGameInfo(player1, player2);
        }

        Player winner = (player1.getScore() > player2.getScore()) ? player1 : player2;
        System.out.println("GAME OVER. " + winner.getName() + " WON. Total rounds: " + round);
    }

    static private void printGameInfo(Player player1, Player player2) {
        System.out.println(player1);
        System.out.println(player2);

        int winner = player1.checkResult(player2);
        String msg = switch (winner) {
            case -1 -> player2.getName() + " WON";
            case  0 -> "DRAW";
            case  1 -> player1.getName() + " WON";
            default -> "ERROR";
        };

        System.out.println(msg);
        System.out.print("SCORE: " + player1.getName() + ": " + player1.getScore());
        System.out.println(" | " + player2.getName() + ": "+ player2.getScore());
        System.out.println();
    }
}
