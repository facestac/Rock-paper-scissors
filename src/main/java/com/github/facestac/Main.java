package com.github.facestac;

import com.github.facestac.shape.Shape;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        ApplicationContext appContext = new ApplicationContext();

        Scanner scanner = new Scanner(System.in);

        Shape shape1 = Shape.PAPER;
        Shape shape2 = Shape.PAPER;

        System.out.println(shape1.equals(shape2));

//        while (true) {
//
//            if (!scanner.hasNextInt()) {
//                scanner.nextLine();
//                continue;
//            }
//            int choice = scanner.nextInt();
//
//            switch (choice) {
//                case 0 -> System.exit(0);
//                case 1 -> {
//                    Game game = new Game();
//                    game.startGame();
//                }
//                case 2 -> {
//                    PlayerResults pr = new PlayerResults();
//                    List<Player> players = pr.loadPlayersResult();
//                    System.out.println(players);
//                }
////                case 3-> {
////                     ObjectMapper mapper = new ObjectMapper();
////                     File file = new  File("storage.json");
////                     BotPlayer player = mapper.readValue(file, BotPlayer.class);
////                    System.out.println(player);
////                }
//                default -> System.out.println("Wrong input");
//            }
//        }
    }
}
