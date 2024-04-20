package com.github.facestac.repositories;

import com.github.facestac.entities.Player;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlayerRepositoryTest {

    private PlayerRepository playerRepository;

    @BeforeEach
    void setUp() {
        playerRepository = PlayerRepositoryImpl.getInstance();
    }

    @AfterEach
    void tearDown() {
        var players = playerRepository.getPlayers();
        if(!players.isEmpty()) {
            players.forEach(player -> {
                playerRepository.removePlayer(player.getId());
            });
        }
    }

    @Test
    void addPlayerAndGetPlayer() {
        var player = new Player("John");

        int playerId = playerRepository.addPlayer(player);

        var retrievedPlayerOptional = playerRepository.getPlayer(playerId);
        Assertions.assertTrue(retrievedPlayerOptional.isPresent());
        var retrievedPlayer = retrievedPlayerOptional.get();
        Assertions.assertEquals(player.getName(), retrievedPlayer.getName());
    }

    @Test
    void removePlayer() {
        var player = new Player("John");
        int playerId = playerRepository.addPlayer(player);

        playerRepository.removePlayer(playerId);

        var removedPlayerOptional = playerRepository.getPlayer(playerId);
        Assertions.assertTrue(removedPlayerOptional.isEmpty());
    }

    @Test
    void updatePlayer() {

        final var oldName = "John";
        final var newName = "Jane";

        var player = new Player(oldName);
        int playerId = playerRepository.addPlayer(player);
        var savedPlayer = playerRepository.getPlayer(playerId);

        Assertions.assertTrue(savedPlayer.isPresent());
        Assertions.assertEquals(oldName, savedPlayer.get().getName());

        var updatedPlayer = savedPlayer.get();
        updatedPlayer.setName(newName);
        playerRepository.updatePlayer(playerId, updatedPlayer);
        var updatedPlayerOptional = playerRepository.getPlayer(playerId);
        Assertions.assertTrue(updatedPlayerOptional.isPresent());

        Assertions.assertEquals(updatedPlayerOptional.get().getName(), newName);
    }

    @Test
    void getPlayers() {
        playerRepository.addPlayer(new Player("John"));
        playerRepository.addPlayer(new Player("Alice"));
        playerRepository.addPlayer(new Player("Bob"));

        var players = playerRepository.getPlayers();

        Assertions.assertEquals(3, players.size());
    }
};