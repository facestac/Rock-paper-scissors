package com.github.facestac.repositories;

import com.github.facestac.entities.Player;
import java.util.List;
import java.util.Optional;

public interface PlayerRepository {

    List<Player> getPlayers();

    int addPlayer(Player player);

    void removePlayer(int id);

    Optional<Player> getPlayer(int id);

    boolean updatePlayer(int id, Player player);
}
