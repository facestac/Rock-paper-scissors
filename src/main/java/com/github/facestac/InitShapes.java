package com.github.facestac;

public class InitShapes {

    static Shape rock = new Shape(ShapesEnum.ROCK);
    static Shape paper = new Shape(ShapesEnum.PAPER);
    static Shape scissors = new Shape(ShapesEnum.SCISSORS);

    static {
        rock.setBeatsList(new ShapesEnum[] {ShapesEnum.SCISSORS});
        rock.setDrawsList(new ShapesEnum[] {ShapesEnum.ROCK});
        rock.setLosesList(new ShapesEnum[] {ShapesEnum.PAPER});

        paper.setBeatsList(new ShapesEnum[] {ShapesEnum.ROCK});
        paper.setDrawsList(new ShapesEnum[] {ShapesEnum.PAPER});
        paper.setLosesList(new ShapesEnum[] {ShapesEnum.SCISSORS});

        scissors.setBeatsList(new ShapesEnum[] {ShapesEnum.PAPER});
        scissors.setDrawsList(new ShapesEnum[] {ShapesEnum.SCISSORS});
        scissors.setLosesList(new ShapesEnum[] {ShapesEnum.ROCK});
    }
}
