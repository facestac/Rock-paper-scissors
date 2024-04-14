package com.github.facestac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Player {
    protected String name;
    protected Shape shape;
    private int score;

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setShape() {
        shape = switch(Integer.parseInt(getShapeNumber())) {
            case 1 -> InitGameParameters.rock;
            case 2 -> InitGameParameters.paper;
            case 3 -> InitGameParameters.scissors;
            default -> null;
        };
    }

    protected String getShapeNumber() {
        Scanner sc = new Scanner(System.in);
        String input;
        List<String> numberList = new ArrayList<>();
        do {
            System.out.println("Choose one of the shapes:");
            int i = 1;
            for ( ShapesEnum shape: ShapesEnum.values()) {
                numberList.add(Integer.toString(i));
                System.out.println(i++ + " - " + shape.name());
            }
            input =  sc.next();

            if (numberList.contains(input)) break;
            else System.out.println("Incorrect input\n");
        } while (true);

        return input;
    }

    public int checkResult(Player other) {
        if (Arrays.asList(shape.getBeatsList()).contains(other.shape.getName())) {
            score += 1;
            return 1;
        }

        if (Arrays.asList(shape.getLosesList()).contains(other.shape.getName())) {
            other.score += 1;
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return name + " chooses: " + shape.getName();
    }
}
