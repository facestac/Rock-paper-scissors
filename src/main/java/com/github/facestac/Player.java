package com.github.facestac;

import java.util.Arrays;
import java.util.Scanner;

public class Player {
    private int score;
    protected Shape shape;

    public int getScore() {
        return score;
    }

//    public void setScore(int score) {
//        this.score = score;
//    }

    public String getShape() {
        return shape.getName().toString();
    }



    public void setShape() {
        shape = switch(Integer.parseInt(getShapeNumber())) {
            case 1 -> InitShapes.rock;
            case 2 -> InitShapes.paper;
            case 3 -> InitShapes.scissors;
            default -> null;
        };
    }

    protected String getShapeNumber() {
        Scanner sc = new Scanner(System.in);
        String input;
        String numberList = "";
        do {
            System.out.println("Choose one of the shapes:");
            Integer i = 1;
            for ( ShapesEnum shape: ShapesEnum.values()) {
                numberList = numberList.concat(i.toString());
                System.out.println(i++ + " - " + shape.name());
            }
            input =  sc.next();

            if (numberList.contains(input)) break;
            else System.out.println("Incorrect input\n");;
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
}
