package com.company;

public class HealthyBurger extends Burger {
    //a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
    // The healthy burger can have 6 items (Additions) in total.
    // hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
    // not the base class (Hamburger), since the two additions are only appropriate for this new class
    // (in other words new burger type).

    private String healthExtra1Name;
    private double healthExtra1Price;

    private String healthExtra2Name;
    private double healthExtra2Price;


    public HealthyBurger(String meat, double price) {
        super("Healthy", "brown rye", meat, price);
    }

    public void addHeathAddition1 (String name, double price){
        this.healthExtra1Name = name;
        this.healthExtra1Price = price;
    }

    public void addHeathAddition2 (String name, double price){
        this.healthExtra2Name = name;
        this.healthExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();

        if(this.healthExtra1Name != null){
            hamburgerPrice += this.healthExtra1Price;
            System.out.println("Added " + this.healthExtra1Name + " for an extra " + this.healthExtra1Price);
        }

        if(this.healthExtra2Name != null){
            hamburgerPrice += this.healthExtra2Price;
            System.out.println("Added " + this.healthExtra2Name + " for an extra " + this.healthExtra2Price);
        }

        return hamburgerPrice;
    }
}
