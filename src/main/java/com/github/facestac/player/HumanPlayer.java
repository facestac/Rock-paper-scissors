package com.github.facestac.player;

import com.github.facestac.player.shape.Shape;

import java.util.Scanner;

public class HumanPlayer extends Player{

    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public Shape selectShape() {
        printShapeType();
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        scanner.close();

        return Shape.values()[inputValue];
    }

    private void printShapeType() {
        System.out.println("Choose shape type:");
        for (int i = 0; i < Shape.values().length; i++) {
            System.out.println((i + 1) + " - " + Shape.values()[i]);
        }
    }
}
