package com.github.facestac.game;

import com.github.facestac.models.Player;

import java.util.List;

public class GameProcess {
    private List<Player> players;
    private final int maxScore = 2;

    public GameProcess(List<Player> players) {
        this.players = players;
//        this.maxScore = maxScore;
    }

    public void startGame() {
        boolean isGameOver = false;
        GameJudge judge = new GameJudge(players);

        while (!isGameOver) {
            GameRound gr = new GameRound(players);
//            judge(gr.getPlayers());
            isGameOver = true;
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
