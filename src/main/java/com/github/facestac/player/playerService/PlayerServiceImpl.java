package com.github.facestac.player.playerService;

import com.github.facestac.player.Player;
import com.github.facestac.player.PlayerStatistics;
import com.github.facestac.player.PlayerView;

import java.util.ArrayList;
import java.util.List;

public class PlayerServiceImpl implements PlayerService{
    public List<PlayerView> convertPlayerListToPlayerViewList(List<Player> playerList) {
        List<PlayerView> playerViewList = new ArrayList<>();

        for (Player player : playerList) {
            String name = player.getName();
            PlayerStatistics stats = player.getPlayerStatistics();
            playerViewList.add(new PlayerView(name, stats));
        }

        return playerViewList;
    }

    public void updatePlayerListFromPlayerViewList(List<Player> playerList, List<PlayerView> playerViewList) {
        for (Player player : playerList) {
                String playerName = player.getName();
            for (PlayerView playerView : playerViewList) {
                if (playerName.equals(playerView.getName())) {
                    PlayerStatistics stats = playerView.getPlayerStatistics();
                    player.setPlayerStatistics(stats);
                }
            }
        }
    }

}
