package com.github.facestac.services;

public class GameServiceImpl implements GameService {

    private final PlayerService playerService;
    private final RoundService roundService;

    public GameServiceImpl(
        PlayerService playerService,
        RoundService roundService
    ) {
        this.playerService = new PlayerServiceImpl();
        this.roundService = new RoundServiceImpl();
    }

}
