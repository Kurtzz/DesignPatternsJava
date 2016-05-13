package com.kurtz.behavioral.iterator;

import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        BikeRepository repository = new BikeRepository();

        repository.addBike("Cervelo");
        repository.addBike("Scott");
        repository.addBike("Fuji");

        Iterator<String> bikeIterator = repository.iterator();

        while (bikeIterator.hasNext()) {
            System.out.println(bikeIterator.next());
        }
    }
}
