package com.github.facestac.services;

import com.github.facestac.entities.Player;
import java.util.List;

public interface PlayerService {

    List<Player> getPlayers();

    Player getPlayerById(int id);

    int createPlayer(Player player);

    Player updatePlayer(int id, Player player);

    void deletePlayerById(int id);
}
