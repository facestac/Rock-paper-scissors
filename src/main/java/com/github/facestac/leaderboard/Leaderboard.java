package com.github.facestac.leaderboard;

import com.github.facestac.player.Player;
import com.github.facestac.player.PlayerView;

import java.util.List;

public interface Leaderboard {
    List<PlayerView> getLeaderboard();

    void updateLeaderboard(List<Player> players);

    void printLeaderboard();
}
