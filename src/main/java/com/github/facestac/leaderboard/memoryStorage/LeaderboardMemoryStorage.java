package com.github.facestac.leaderboard.memoryStorage;

import com.github.facestac.leaderboard.Leaderboard;
import com.github.facestac.player.Player;
import com.github.facestac.player.PlayerStatistics;
import com.github.facestac.player.PlayerView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeaderboardMemoryStorage implements Leaderboard {
    private List<PlayerView> listTopPlayers = new ArrayList<>();

    public List<PlayerView> loadData() {
        if (listTopPlayers.isEmpty()) return null;

        return listTopPlayers;
    }

    public void updateData(List<Player> players) {
        if (listTopPlayers.isEmpty()) {
            saveData(players);
        } else {
            for (Player player : players) {
                String name = player.getName();
                PlayerStatistics playerStats = player.getPlayerStatistics();
                boolean isMatched = false;

                for (PlayerView playerView : listTopPlayers) {
                    String nameTopPlayer = playerView.getName();
                    if (nameTopPlayer.equals(name)) {
                        playerView.setPlayerStatistics(playerStats);
                        isMatched = true;
                        break;
                    }
                }

                if (!isMatched) {
                    listTopPlayers.add(new PlayerView(name, playerStats));
                }
            }
        }
    }

    public void saveData(List<Player> players) {
        for (Player player : players) {
            String name = player.getName();
//            PlayerView value = new PlayerView(key, player.getPlayerStatistics());
//            listTopPlayers.put(key, value);
            listTopPlayers.add(new PlayerView(name, player.getPlayerStatistics()));
        }
    }
}
