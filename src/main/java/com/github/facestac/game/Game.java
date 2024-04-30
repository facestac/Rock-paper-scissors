package com.github.facestac.game;

import com.github.facestac.models.Player;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameProcess {
    private Map<Player, Integer> players;
    private int maxScore;

    public GameProcess(List<Player> players, int maxScore) {
        this.players  = new HashMap<>((HashMap) List.of(players));
//        this.players = players;
        this.maxScore = maxScore;

//        gameProcess();
    }

    public void startGame() {
        boolean isGameOver = false;
        while (isGameOver) {
            gameLoop();
        }
    }

    private void gameLoop() {
        spawnShapes();
    }

    private void spawnShapes() {
        for (Map<Player, Integer> player : players) {
//            player.selectShape();
        }
    }

    private printGameINfo() {
        for (Player player : players) {
            System.out.println(player.getName() + " : " + );
        }
    }



    //
//
//
//    public static void main(String[] args){
//        Game game = new Game();
//        ArrayList<Player> players = game.createPlayers(2);
//        game.drawShapes(players);
//
//        for (Player player : players) {
//            System.out.println(player.getName() + " : " + player.getShape().getName());
//            if (player.isWonSomeone(players)) player.setScore(player.getScore() + 1);
//        }
//
//        game.printWinner(players);
//    }
//
//
//    private ArrayList<Player> createPlayers(int playersCount) {
//        ArrayList<Player> players = new ArrayList<>();
//
//        for (int i = 0; i < playersCount; i++) {
//            Player player = new PlayerBot("Bot" + (i + 1));
//            players.add(player);
//        }
//
//        return players;
//    }
//
//    private void drawShapes(ArrayList<Player> players) {
//        for (Player player : players) {
//            player.setShape(player.drawShape());
////            System.out.println(player.getShape().getName());
//        }
//    }
//
//    private void printWinner(ArrayList<Player> players) {
//        boolean isThereWinner = false;
//        for (Player player : players) {
//            if (player.getScore() == 1) {
//                System.out.println(player.getName() + " WINS");
//                isThereWinner = true;
//            }
//        }
//
//        if (!isThereWinner) System.out.println("DRAW");
//    }
}
