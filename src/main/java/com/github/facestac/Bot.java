package com.github.facestac;

import java.util.Random;

/**
 * Класс для бота (автоигрок)
 */
public class Bot extends Player{
    /**
     * Конструктор класса
     * @param name задаем имя бота
     */
    Bot(String name) {
        super(name);
    }

    /**
     * Перегружаем метод, которым получаем номер для выбора фигуры
     *
     * @return возвращаем число из диапазона допустимых фигур
     */
    @Override
    protected int getShapeNumber()  {
        Random r = new Random();
        int shapesCount = ShapesEnum.values().length;

        return r.nextInt(shapesCount);
    }

}
