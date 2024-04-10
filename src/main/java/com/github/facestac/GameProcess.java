package com.github.facestac;

import java.util.Random;
import java.util.Scanner;

public class GameProcess {

    public void gameLoop() {
        while (true) {
          int input = input();
          if (input == 0) return;
          Shape shape = spawnShape();
          shape.printShape();
        }

    }

    private int input() {
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }

    private Shape spawnShape() {

        Random r = new Random();
        int shapesCount = DefineShapes.values().length;

        return switch(r.nextInt(shapesCount) + 1) {
            case 1 -> new Rock();
            case 2 -> new Paper();
            case 3 -> new Scissors();
            default -> null;
        };
    }


}
