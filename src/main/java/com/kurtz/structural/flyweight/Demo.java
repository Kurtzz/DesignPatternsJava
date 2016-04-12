package com.kurtz.structural.flyweight;

public class Demo {

    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();

        inventorySystem.takeOrder("Roomba", 221);
        inventorySystem.takeOrder("Bose Headphones", 361);
        inventorySystem.takeOrder("Samsung TV", 432);
        inventorySystem.takeOrder("Samsung TV", 323);
        inventorySystem.takeOrder("Roomba", 563);
        inventorySystem.takeOrder("Bose Headphones", 321);
        //...

        inventorySystem.process();
        System.out.println(inventorySystem.report());
    }
}
