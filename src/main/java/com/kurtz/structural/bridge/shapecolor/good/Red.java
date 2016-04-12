package com.kurtz.structural.bridge.shapecolor.good;

/**
 * Created by P on 05.04.2016.
 */
public class Red implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}
