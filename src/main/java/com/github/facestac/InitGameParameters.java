package com.github.facestac;

import java.util.ArrayList;
import java.util.List;

/**
 * Инициализируем фигуры и некоторые игровые константы
 */
public class InitGameParameters {
    /**
     * Игровые фигуры и список этих фигур
     */
    static final Shape rock = new Shape(ShapesEnum.ROCK);
    static final Shape paper = new Shape(ShapesEnum.PAPER);
    static final Shape scissors = new Shape(ShapesEnum.SCISSORS);

    static final List<Shape> shapeList = new ArrayList<>();
    /**
     * Дефолтные константы для быстрой игры:
     * Число очков для победы
     * Количество игроков
     */
    static final int MAX_SCORE = 3;
    static final int NUMBER_OF_PLAYERS = 3;

    static {
        setShapeOptions();
        shapeList.add(rock);
        shapeList.add(paper);
        shapeList.add(scissors);
    }

    /**
     * Задаем для каждой фигуры массив значений фигур, которые она может выбить
     */
    static private void setShapeOptions() {
        rock.setBeatsList(new ShapesEnum[] {ShapesEnum.SCISSORS});

        paper.setBeatsList(new ShapesEnum[] {ShapesEnum.ROCK});

        scissors.setBeatsList(new ShapesEnum[] {ShapesEnum.PAPER});
    }
}
