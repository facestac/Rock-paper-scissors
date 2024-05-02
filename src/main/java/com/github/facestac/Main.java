package com.github.facestac;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.facestac.game.Game;
import com.github.facestac.game.PlayerResults;
import com.github.facestac.models.BotPlayer;
import com.github.facestac.models.Player;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("1 - start new game");
            System.out.println("2 - show statistics");
            System.out.println("0 - exit game");
            if (!scanner.hasNextInt()) {
                scanner.nextLine();
                continue;
            }
            int choice = scanner.nextInt();

            switch (choice) {
                case 0 -> System.exit(0);
                case 1 -> {
                    Game game = new Game();
                    game.startGame();
                }
                case 2 -> {
                    PlayerResults pr = new PlayerResults();
                    List<Player> players = pr.loadPlayersResult();
                    System.out.println(players);
                }
//                case 3-> {
//                     ObjectMapper mapper = new ObjectMapper();
//                     File file = new  File("storage.json");
//                     BotPlayer player = mapper.readValue(file, BotPlayer.class);
//                    System.out.println(player);
//                }
                default -> System.out.println("Wrong input");
            }
        }
    }
}
