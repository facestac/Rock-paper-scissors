package com.github.facestac.entities;

/**
 * Класс описывает фигуру (жест)
 */
public class Shape {
    /**
    * Название фигуры (жеста), которое выкидывает игрок
     * */
    private final ShapeType name;

    /**
     * Список фигур, которые можно побить
     */
    private ShapeType[] beatsList;

    /**
     * Конструктор класса
     * @param name имя фигуры
     */
    Shape(ShapeType name) {
        this.name = name;
    }

    /**
     * геттеры и сеттеры
     */
    public ShapeType[] getBeatsList() {
        return beatsList;
    }

    public void setBeatsList(ShapeType[] beatsList) {
        this.beatsList = beatsList;
    }

    public ShapeType getName() {
        return name;
    }
}
