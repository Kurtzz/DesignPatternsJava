package com.kurtz.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
    protected String name;
    protected String url;
    List<MenuComponent> menuComponents = new ArrayList<>();

    //Just a feature
    public MenuComponent add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    //Just a feature
    public MenuComponent remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public abstract String toString();

    protected String print(MenuComponent menuComponent) {
        StringBuilder builder = new StringBuilder(name);
        builder.append(": ");
        builder.append(url);
        builder.append("\n");

        return builder.toString();
    }
}
