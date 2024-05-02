package com.github.facestac.models;

import com.github.facestac.types.ShapeType;
import java.util.Scanner;

public class HumanPlayer extends Player{

    public HumanPlayer(int id) {
        super(id);
    }

    public HumanPlayer(int id, String name) {
        super(id, name);
    }

    public HumanPlayer(int id, String name, int totalGames, int totalWins) {
        super(id, name, totalGames, totalWins);
    }

    @Override
    public ShapeType selectShape() {
        printShapeTypes();
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        scanner.close();

        return ShapeType.values()[inputValue];
    }

    private void printShapeTypes() {
        System.out.println("Choose shape type:");
        for (int i = 0; i < ShapeType.values().length; i++) {
            System.out.println((i + 1) + " - " + ShapeType.values()[i]);
        }
    }
}
