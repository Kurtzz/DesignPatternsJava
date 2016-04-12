package com.kurtz.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> items = new HashMap<String, Item>();

    public Registry() {
    }

    public Item createItem(String type) {
        Item item = null;

        try {
            item = (Item) items.get(type).clone(); //shallow copy
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }
}
