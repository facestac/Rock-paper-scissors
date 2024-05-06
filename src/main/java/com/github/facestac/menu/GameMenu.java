package com.github.facestac.menu;

import com.github.facestac.game.Game;
import com.github.facestac.gameOptions.GameOptions;
import com.github.facestac.leaderboard.Leaderboard;
import com.github.facestac.player.PlayerView;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GameMenu {
    private final GameOptions gameOptions;
    private final Leaderboard leaderboard;
    private final Game game;
    private final Scanner scanner = new Scanner(System.in);

//    private Map<String, Method> menuList = new HashMap<>() {
//        {put("1 - quick game", GameMenu.class.getDeclaredMethod("exitGame"))}
//    };

    public GameMenu(GameOptions gameOptions, Leaderboard leaderboard, Game game) {
        this.gameOptions = gameOptions;
        this.leaderboard = leaderboard;
        this.game = game;
    }

    public void showMenu() {
        printMainMenu();
    }

    private void printMainMenu() {
        do {
            System.out.println();
            System.out.println("1 - quick game");
            System.out.println("2 - set default game options");
            System.out.println("3 - show leaderboard");
            System.out.println("0 - exit game");
        } while (makeChoice() != 0);

        scanner.close();
    }

    private int makeChoice() {
        int choice = -1;

        if (!scanner.hasNextInt()) {
            scanner.nextLine();
        } else {
            choice = scanner.nextInt();

            switch (choice) {
                case 0 -> exitGame();
                case 1 -> startQuickGame();
                case 2 -> setDefaultGameOptions();
                case 3 -> showLeaderboard();
                default -> choice = -1;
            }
        }

        if (choice == -1) System.out.println("Wrong input");

        return choice;
    }

    private void exitGame() {
        System.exit(0);
    }

    private void startQuickGame() {
        game.startGame();
    }

    private void setDefaultGameOptions() {
        gameOptions.setDefaultGameOptions();
    }

    private void showLeaderboard() {
        leaderboard.printLeaderboard();
    }
}
