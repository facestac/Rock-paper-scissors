package com.github.facestac;


import com.github.facestac.game.GameProcess;
import com.github.facestac.game.InitGameParameters;
import com.github.facestac.models.Player;

import java.util.List;

public class Main {

    public static void main(String[] args){
//        int playersCount = 2;
//        int maxScore = 2;
        InitGameParameters initGP = new InitGameParameters();
        List<Player> players = initGP.addPlayersToGame();
//        players.add(new BotPlayer("Bot1"));
//        players.add(new BotPlayer("Bot2"));
        GameProcess game = new GameProcess(players);
        game.startGame();
    }
}
