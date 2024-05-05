package com.github.facestac.game;

import com.github.facestac.IOStream.InputOutputStream;
import com.github.facestac.IOStream.InputOutputJson;
import com.github.facestac.player.Player;

import java.util.List;

public class PlayerResults {
    public void savePlayersResult(List<Player> players) {
        InputOutputStream ioStream = new InputOutputJson();
        ioStream.saveData(players);
    }

    public List<Player> loadPlayersResult() {
        InputOutputStream ioStream = new InputOutputJson();
        return ioStream.loadData();
    }
}
