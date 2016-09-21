package com.kurtz.behavioral.templatemethod;

public class Demo {
    public static void main(String[] args) {
        OrderTemplate order1 = new StoreORder();
        OrderTemplate order2 = new WebOrder();

        order1.processOrder();
        order2.processOrder();
    }
}
