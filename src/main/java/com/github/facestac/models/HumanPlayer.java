package com.github.facestac.models;

import com.github.facestac.types.ShapeType;

import java.util.Scanner;

public class HumanPlayer extends Player{
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public ShapeType selectShape() {
        printShapeTypes();
        int inputValue = scanner.nextInt();
        return ShapeType.values()[inputValue];
    }

    private void printShapeTypes() {
        System.out.println("Choose shape type:");
        for (int i = 0; i < ShapeType.values().length; i++) {
            System.out.println((i + 1) + " - " + ShapeType.values()[i]);
        }
    }
}
