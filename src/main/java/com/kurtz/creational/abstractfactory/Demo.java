package com.kurtz.creational.abstractfactory;

public class Demo {
    public static void main(String[] args) {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
        System.out.println(card.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(600);
        CreditCard card1 = abstractFactory.getCreditCard(CardType.GOLD);
        System.out.println(card1.getClass());
    }
}
