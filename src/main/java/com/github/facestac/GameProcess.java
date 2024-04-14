package com.github.facestac;

import java.util.Scanner;

public class GameProcess {

    public void gameInit() {
        Scanner sc = new Scanner(System.in);
        String mode;

        do {
            System.out.println("Choose the game mode:");
            System.out.println("1 - Player vs Bot");
            System.out.println("2 - Bot vs Bot");
            mode = sc.next();
            if ("12".contains(mode)) break;
            else System.out.println("Wrong input. Try again.");
        } while (true);

        if (mode.equals("1")) gameLoop(new Player(), new Bot());
        else gameLoop(new Bot(), new Bot());
    }

    private void gameLoop(Player player1, Player player2) {
        final int HIGH_SCORE = 3;


//        Player player1 = new Player();
//        Player player2 = new Bot();

        int iter = 0;

        while (player1.getScore() < HIGH_SCORE && player2.getScore() < HIGH_SCORE) {
        player1.setShape();
        player2.setShape();

        System.out.print("PLAYER1 choose: " + player1.getShape());
        System.out.println(" | PLAYER2 choose: " + player2.getShape());

            int winner = player1.checkResult(player2);
            String msg = switch (winner) {
                case -1 -> "PLAYER 2 WINS";
               case  0 -> "DRAW";
                case 1 -> "PLAYER 1 WINS";
                default -> "ERROR";
            };
            System.out.println(msg);
            System.out.print("\nSCORE: P1 = " + player1.getScore());
            System.out.println(" | P2 = " + player2.getScore());

//          String input = input();
//          if (input.equals("q")) return;
//          Shape shape = spawnShape();
//          shape.printShape();
        }

    }




//    private Shape spawnShape(int shapesCount) {
//
////        Random r = new Random();
////        int shapesCount = ShapesEnum.values().length;
//
//
////        return switch(r.nextInt(shapesCount) + 1) {
//        return switch(shapesCount) {
//            case 1 -> new Rock();
//            case 2 -> new Paper();
//            case 3 -> new Scissors();
//            default -> null;
//        };
//    }


}
