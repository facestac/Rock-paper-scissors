package com.github.facestac.player.playerService;

import com.github.facestac.player.Player;
import com.github.facestac.player.PlayerView;

import java.util.List;

public interface PlayerService {

    List<PlayerView> convertPlayerListToPlayerViewList(List<Player> playerList);

    void updatePlayerListFromPlayerViewList(List<Player> playerList, List<PlayerView> playerViewList);

}
