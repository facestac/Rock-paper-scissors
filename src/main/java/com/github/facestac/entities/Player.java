package com.github.facestac.entities;

/**
 * Класс игрока. Расширяется до класса Bot.
 */
public class Player {

    private Integer id;
    /**
     * Имя игрока
     */
    private String name;

    private PlayerType type;

    public Player(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Player(String name) {
        this.name = name;
    }

    public Player(Integer id, String name, PlayerType type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getType() {
        return type;
    }

    public void setType(PlayerType type) {
        this.type = type;
    }
}
