package com.github.facestac.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Round {

    private Integer id;
    private String title;
    private Map<Integer, Shape> players;
    private List<Integer> winners;

    public Round(Integer id, String title) {
        this.id = id;
        this.title = title;
        this.players = new HashMap<>();
        this.winners = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Map<Integer, Shape> getPlayers() {
        return players;
    }

    public List<Integer> getWinners() {
        return winners;
    }

    public void addPlayerMove(int playerId, Shape shape) {
        players.put(playerId, shape);
    }

    public void addWinner(int playerId) {
        winners.add(playerId);
    }
}
