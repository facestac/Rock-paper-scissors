package com.github.facestac.leaderboard;

import com.github.facestac.dataStorage.DataStorage;
import com.github.facestac.player.Player;
import com.github.facestac.player.PlayerView;
import com.github.facestac.player.playerService.PlayerService;
import com.github.facestac.player.playerService.PlayerServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class LeaderboardImpl implements Leaderboard{

    private List<PlayerView> topPlayersList = new ArrayList<>();
    private PlayerService playerService = new PlayerServiceImpl();
    private DataStorage storage;

    public LeaderboardImpl(DataStorage storage) {
        this.storage = storage;
    }

    public List<PlayerView> getLeaderboard() {
        if (storage.isEmpty()) return null;

        topPlayersList = storage.getData();
        return topPlayersList;
    }

    public void updateLeaderboard(List<Player> players) {
        topPlayersList = playerService.convertPlayerListToPlayerViewList(players);
        storage.setData(topPlayersList);
    }

    public void printLeaderboard() {
        if (topPlayersList.isEmpty()) {
            System.out.println("Leaderboard is empty");
        } else {
            for (PlayerView player : topPlayersList) {
                System.out.println(player);
            }
        }
    }
}
