package com.kurtz.structural.bridge.shapecolor.good;

public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public void applyColor() {
        color.applyColor();
    }
}
