package com.github.facestac.game;

import com.github.facestac.gameOptions.GameOptions;
import com.github.facestac.leaderboard.Leaderboard;
import com.github.facestac.player.Player;
import com.github.facestac.player.PlayerStatistics;

import java.util.List;

public class Game {
    private final GameOptions gameOptions;
    private final Leaderboard leaderboard;

    public Game(GameOptions gameOptions, Leaderboard leaderboard) {
        this.gameOptions = gameOptions;
        this.leaderboard = leaderboard;
    }

    public void startGame()  {
        int pointsForVictory = gameOptions.getPointsForVictory();
        List<Player> players = gameOptions.getListOfPlayers();
        resetGamePoints(players);

        gameProcess(players, pointsForVictory);
    }

    private void resetGamePoints(List<Player> players) {
        for (Player player : players) {
            player.setCurrentScore(0);
        }
    }

    private void gameProcess(List<Player> players, int pointsForVictory) {
        Round round = new Round(players);
        boolean isGameOver = false;

        while (!isGameOver) {
            Player winner = round.playRoundAndGetWinner();
            if (winner != null && winner.getCurrentScore() == pointsForVictory) {
                isGameOver = true;
                printGameWinner(winner);
                updatePlayersStatistics(players, winner);
            }
        }

    }

    private void printGameWinner(Player winner) {
        System.out.println(winner.getName() + " WINS game!");
    }

    private void updatePlayersStatistics(List<Player> players, Player winner) {
        for (Player player : players) {
            PlayerStatistics stats = player.getPlayerStatistics();
            stats.setTotalGames(stats.getTotalGames() + 1);

            if (player.equals(winner)) stats.setTotalWins(stats.getTotalWins() + 1);
        }

        leaderboard.updateLeaderboard(players);
    }
}