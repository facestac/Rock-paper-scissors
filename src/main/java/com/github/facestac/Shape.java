package com.github.facestac;

/**
 * Класс описывает фигуру (жест)
 */
public class Shape {
    /**
    * Название фигуры (жеста), которое выкидывает игрок
     * */
    private final ShapesEnum name;

    /**
     * Список фигур, которые можно побить
     */
    private ShapesEnum[] beatsList;

    /**
     * Конструктор класса
     * @param name имя фигуры
     */
    Shape(ShapesEnum name) {
        this.name = name;
    }

    /**
     * геттеры и сеттеры
     */
    public ShapesEnum[] getBeatsList() {
        return beatsList;
    }

    public void setBeatsList(ShapesEnum[] beatsList) {
        this.beatsList = beatsList;
    }

    public ShapesEnum getName() {
        return name;
    }
}
