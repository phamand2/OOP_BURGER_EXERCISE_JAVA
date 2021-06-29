package com.company;

public class Main {

    public static void main(String[] args) {
        Burger hamburger = new Burger("Basic", "white", "sausage", 3.56);
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("lettuce", 0.27);
        hamburger.addHamburgerAddition2("tomato", 0.75);
        hamburger.addHamburgerAddition3("cheese", 1.13);
        System.out.println("Total Burger price is " +  String.format("%2f", hamburger.itemizeHamburger()));

        HealthyBurger healthBurger = new HealthyBurger("Bacon", 5.67);
        healthBurger.addHamburgerAddition1("Egg", 5.43);
        healthBurger.addHeathAddition1("lentils", 3.41);
        healthBurger.itemizeHamburger();
        System.out.println("Total Burger price is " +  String.format("%2f", healthBurger.itemizeHamburger()));

        DeluxHamburger db = new DeluxHamburger();
        System.out.println("Total Burger price is " +  String.format("%2f", db.itemizeHamburger()));
    }
}
