package com.github.facestac.models;

import com.github.facestac.types.ShapeType;
import java.util.Scanner;

public class HumanPlayer extends Player{

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
