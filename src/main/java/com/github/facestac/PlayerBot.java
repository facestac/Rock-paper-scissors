package com.github.facestac;

public class PlayerBot extends Player{
    PlayerBot(String name) {
        super(name);
    }

    @Override
    public String drawShape() {
        return "Rock";
    }
}
