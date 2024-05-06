package com.github.facestac;

import com.github.facestac.dataStorage.DataStorage;
import com.github.facestac.dataStorage.memoryStorage.MemoryStorage;
import com.github.facestac.game.Game;
import com.github.facestac.gameOptions.GameOptions;
import com.github.facestac.gameOptions.GameOptionsImpl;
import com.github.facestac.leaderboard.Leaderboard;
import com.github.facestac.leaderboard.LeaderboardImpl;
import com.github.facestac.menu.GameMenu;

public class ApplicationContext {
    private GameOptions gameOptions;
    private DataStorage storage;
    private Leaderboard leaderboard;
    private final GameMenu gameMenu;
    private Game game;

    public ApplicationContext() {
        gameOptions = new GameOptionsImpl();
        storage = new MemoryStorage();
        leaderboard = new LeaderboardImpl(storage);
        game = new Game(gameOptions, leaderboard);
        gameMenu = new GameMenu(gameOptions, leaderboard, game);
    }


    public void run() {
        gameMenu.showMenu();
    }
}
