package com.github.facestac;

public class InitGameParameters {
    /**
     * Игровые фигуры
     */
    static final Shape rock = new Shape(ShapesEnum.ROCK);
    static final Shape paper = new Shape(ShapesEnum.PAPER);
    static final Shape scissors = new Shape(ShapesEnum.SCISSORS);

    static final int MAX_SCORE = 5;
    static final int NUMBER_OF_PLAYERS = 2;

    static {
        setShapeOptions();
    }

    static private void setShapeOptions() {
        rock.setBeatsList(new ShapesEnum[] {ShapesEnum.SCISSORS});
        rock.setLosesList(new ShapesEnum[] {ShapesEnum.PAPER});

        paper.setBeatsList(new ShapesEnum[] {ShapesEnum.ROCK});
        paper.setLosesList(new ShapesEnum[] {ShapesEnum.SCISSORS});

        scissors.setBeatsList(new ShapesEnum[] {ShapesEnum.PAPER});
        scissors.setLosesList(new ShapesEnum[] {ShapesEnum.ROCK});
    }
}
