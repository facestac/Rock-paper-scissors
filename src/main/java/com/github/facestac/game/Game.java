package com.github.facestac.game;

import com.github.facestac.IOStream.InputOutputStream;
import com.github.facestac.IOStream.InputOutputJson;
import com.github.facestac.models.Player;
import java.util.List;

public class Game {
    private List<Player> players;
    private int maxScore;

    public void startGame()  {
        Game game = new Game();
        game.setGameParameters();

        InputOutputStream json = new InputOutputJson();
        json.saveData(players);
        game.gameProcess();
    }

    private void setGameParameters() {
        InitGame ig = new InitGame();
        players = ig.getPlayers();
        maxScore = ig.getMaxScore();
    }


    private void gameProcess() {
        GameRound gr = new GameRound(players);
        boolean isGameOver = false;

        while (!isGameOver) {
            Player winner = gr.playRound();
            if (winner != null && winner.getCurrentScore() == maxScore) {
                isGameOver = true;
                printGameWinner(winner);
                savePlayerStatistics(winner);
            }
        }

    }

    private void printGameWinner(Player winner) {
        System.out.println(winner.getName() + " WINS game!");
    }

    private void savePlayerStatistics(Player winner) {
        for (Player player : players) {
            player.setTotalGames(player.getTotalGames() + 1);
        }
        winner.setTotalWins(winner.getTotalWins() + 1);

        PlayerResults pr = new PlayerResults();
        pr.savePlayersResult(players);
    }
}