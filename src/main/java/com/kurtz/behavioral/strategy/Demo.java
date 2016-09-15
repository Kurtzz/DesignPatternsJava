package com.kurtz.behavioral.strategy;

public class Demo {
    public static void main(String[] args) {
        CreditCard amexCard = new CreditCard(new AmexStrategy());

        amexCard.setNumber("379185883464283");
        amexCard.setDate("04/2020");
        amexCard.setCvv("123");
        System.out.println("Is Amex valid: " + amexCard.isValid());
    }
}
