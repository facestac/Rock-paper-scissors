package com.github.facestac.player.shape;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public enum Shape {
    ROCK,
    PAPER,
    SCISSORS;

    private Set<Shape> beatsList;

    static {
        ROCK.beatsList = new HashSet<>(List.of(SCISSORS));
        PAPER.beatsList = new HashSet<>(List.of(ROCK));
        SCISSORS.beatsList = new HashSet<>(List.of(PAPER));
    }

    public boolean isBeats(Shape another) {
        if (isSameShape(another)) return false;

        return this.beatsList.contains(another);
    }

    private boolean isSameShape(Shape another) {
        return this.equals(another);
    }
}
