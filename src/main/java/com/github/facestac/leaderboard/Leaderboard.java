package com.github.facestac.leaderboard;

import com.github.facestac.player.Player;
import com.github.facestac.player.PlayerView;

import java.util.List;
import java.util.Map;

public interface Leaderboard {
    List<PlayerView> loadData();

    void updateData(List<Player> players);

    void saveData(List<Player> players);
}
