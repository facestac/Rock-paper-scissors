package com.github.facestac.services;

import com.github.facestac.entities.Player;
import com.github.facestac.exceptions.PlayerNotFoundException;
import com.github.facestac.repositories.PlayerRepository;
import com.github.facestac.repositories.PlayerRepositoryImpl;
import java.util.List;

public class PlayerServiceImpl implements PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerServiceImpl() {
        this.playerRepository = PlayerRepositoryImpl.getInstance();
    }

    @Override
    public List<Player> getPlayers() {
        return playerRepository.getPlayers();
    }

    @Override
    public Player getPlayerById(int id) {
        return playerRepository.getPlayer(id).orElseThrow(() -> new PlayerNotFoundException(id));
    }

    @Override
    public int createPlayer(Player player) {
        return playerRepository.addPlayer(player);
    }

    @Override
    public Player updatePlayer(int id, Player player) {
        if (playerRepository.updatePlayer(id, player)) {
            throw new PlayerNotFoundException(id);
        }
        return player;
    }

    @Override
    public void deletePlayerById(int id) {
        playerRepository.removePlayer(id);
    }
}
