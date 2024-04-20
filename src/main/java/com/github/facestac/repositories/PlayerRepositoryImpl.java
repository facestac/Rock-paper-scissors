package com.github.facestac.repositories;

import com.github.facestac.entities.Player;
import com.github.facestac.exceptions.PlayerExistsException;
import com.github.facestac.exceptions.PlayerNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class PlayerRepositoryImpl implements PlayerRepository {

    private static PlayerRepositoryImpl instance;
    private final Map<Integer, Player> players;
    private final AtomicInteger idSequence;

    private PlayerRepositoryImpl() {
        this.players = new HashMap<>();
        this.idSequence = new AtomicInteger(1);
    }

    public static synchronized PlayerRepositoryImpl getInstance() {
        if (instance == null) {
            instance = new PlayerRepositoryImpl();
        }
        return instance;
    }

    @Override
    public List<Player> getPlayers() {
        var playerList = new ArrayList<Player>();
        if (!players.isEmpty()) {
            playerList.addAll(players.values());
        }
        return playerList;
    }

    @Override
    public int addPlayer(Player player) {
        if (player != null) {

            if (player.getId() != null && isExists(player.getId())) {
                throw new PlayerExistsException( player.getId());
            }

            player.setId(idSequence.getAndIncrement());
            players.put(player.getId(), player);

            return player.getId();
        }

        return 0;
    }

    @Override
    public void removePlayer(int id) {
        if (isExists(id)) {
            players.remove(id);
        } else {
            throw new PlayerNotFoundException(id);
        }
    }

    @Override
    public Optional<Player> getPlayer(int id) {
        return Optional.ofNullable(players.get(id));
    }

    @Override
    public boolean updatePlayer(int id, Player player) {
        if (id != player.getId() && !isExists(id)) {
            throw new PlayerNotFoundException(id);
        }

        players.put(id, player);
        return true;
    }


    private boolean isEmpty() {
        return players.isEmpty();
    }

    private boolean isExists(int id) {
        return players.containsKey(id);
    }
}
