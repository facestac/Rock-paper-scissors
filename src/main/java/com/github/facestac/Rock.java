package com.github.facestac;

import java.util.ArrayList;

public class Rock extends Shape{
    Rock(ShapeType name) {
        super(name);
        beatsList.add(ShapeType.SCISSORS);
    }
}
