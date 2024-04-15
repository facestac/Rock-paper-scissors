package com.github.facestac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Класс игрока. Расширяется до класса Bot.
 */
public class Player {
    /**
     * Имя игрока
     */
    protected String name;
    /**
     * Фигура (жест), которую покзывает игрок
     */
    protected Shape shape;
    /**
     * Счет игрока
     */
    private int score;

    /**
     * Конструктор класса
     * @param name имя игрока
     */
    Player(String name) {
        this.name = name;
    }

    /**
     * геттеры и сеттеры
     */
    public void setShape(int shapeNumber) {
        if (shapeNumber >= 0 & shapeNumber < InitGameParameters.shapeList.size())
            shape = InitGameParameters.shapeList.get(shapeNumber);
    }

    public void setShape() {
        shape = InitGameParameters.shapeList.get(getShapeNumber());
    }

    public Shape getShape() {
        return shape;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    /**
     * Добавляет очки к текущему счету
     * @param points количество очков для добавления
     */
    public void addScore(int points) {
        this.score += points;
    }


    /**
     * Пользовательсктй ввод. Проверка корректности ввода.
     * Получаем фигуру по номеру, которую ввел игрок
     *
     * @return int значение ввода
     */
    protected int getShapeNumber() {
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

        return Integer.parseInt(input) - 1;
    }

    /**
     * Проверяем, может ли текущая фигура побить другую
     *
     * @param other другая фигура, которую будем бить
     * @return 1 - истина, 0 - ложь
     */
    public int isWinsAnother(Player other) {
        if (Arrays.asList(shape.getBeatsList()).contains(other.shape.getName()))
            return 1;

        return 0;
    }

    /**
     * Получаем количество игроков, которых смог победить текущий игрок
     * @param otherPlayers список других игроков
     * @return количество битых игроков
     */
    public int getNumberOfBeaten(List<Player> otherPlayers) {
        int numBeaten = 0;
        for (Player otherPlayer: otherPlayers) {
            numBeaten += this.isWinsAnother(otherPlayer);
        }

        return numBeaten;
    }

    /**
     * Перегрузка стандартного метода.
     *
     * @return возвращаем строку для вывода в удобной для нас форме (какую фигуру выбрал игрок)
     */
    @Override
    public String toString() {
        return name + " chooses: " + shape.getName();
    }
}
