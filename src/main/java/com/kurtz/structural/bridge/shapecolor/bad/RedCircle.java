package com.kurtz.structural.bridge.shapecolor.bad;

/**
 * Created by P on 05.04.2016.
 */
public class RedCircle extends Circle {
    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}
