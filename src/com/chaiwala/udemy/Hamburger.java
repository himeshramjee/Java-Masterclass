package com.chaiwala.udemy;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

// TODO: validate that we have pricing for all Extras
class HamburgerOptions {
    enum Extras {
        HotSauce,
        Lettuce,
        Cheese,
        Egg,
        Toasted,
        Mayonaise,
        Onions,
        Avocado
    }

    Hashtable<Extras, Double> burgerOptions = new Hashtable<Extras, Double>();

    public HamburgerOptions() {
        burgerOptions.put(Extras.HotSauce, 5.00);
        burgerOptions.put(Extras.Lettuce, 10.00);
        burgerOptions.put(Extras.Cheese, 12.00);
        burgerOptions.put(Extras.Egg, 8.00);
        burgerOptions.put(Extras.Toasted, 0.50);

        for(Extras e : Extras.values()) {
            if (!burgerOptions.containsKey(e)){
                System.out.println("ERROR: Burger Options aren't configured correctly");
                // throw new Exception("Burger Options aren't configured correctly");
            }
        }
    }

    public Hashtable<Extras, Double> getBurgerOptions() {
        return burgerOptions;
    }

    public void addOption(Extras extra, double price) {
        burgerOptions.put(extra, price);
    }
}

public class Hamburger {
    enum BreadType {
        Plain,
        SesemeSeed,
        Portugese,
        Wholewheat
    }

    private double basePrice = 40.00;
    private BreadType breadType = BreadType.Plain;
    private int extrasLimit = 4;
    private List<HamburgerOptions.Extras> extras = new ArrayList<>();
    Hashtable<HamburgerOptions.Extras, Double> burgerOptions = new HamburgerOptions().getBurgerOptions();

    public Hamburger(BreadType breadType, int extrasLimit) {
        this.breadType = breadType;
        this.extrasLimit = extrasLimit;
    }

    public void addExtraTopping(HamburgerOptions.Extras extraTopping) {
        if (this.extras.size() < this.extrasLimit) {
            this.extras.add(extraTopping);
        } else{
            System.out.println("Toppings limit reached (" + this.extras.size() + extrasLimit + "). Please remove a selected topping before trying to another.");
        }
    }

    public double getTotalPrice() {
        double totalPrice = basePrice;

        if (extras.size() > 0) {
            System.out.println("\tExtras added, getting prices...");

            for(HamburgerOptions.Extras e : extras) {
                if (burgerOptions.containsKey(e)) {
                    totalPrice += burgerOptions.get(e);
                    System.out.println("\t" + e.name() + " - " + burgerOptions.get(e));
                } else {
                    System.out.println("Burger option " + e + " has no price configured.");
                }
            }
        }

        return totalPrice;
    }

    public void printSummary() {
        System.out.println();
        System.out.println("New (" + this.getClass().getSimpleName() + ") + Burger - (" + breadType + ", " + extras.size() + " extras)");
        System.out.println("\t Total Price: " + getTotalPrice());
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public List<HamburgerOptions.Extras> getExtras() {
        return extras;
    }
}

class VeggieBurger extends Hamburger {

    enum PattyOption {
        Soya,
        Quorn,
        Vegetable
    }

    private PattyOption pattyOption;

    public VeggieBurger(BreadType breadType, int extrasLimit, PattyOption pattyOption) {
        super(breadType, extrasLimit);
        super.burgerOptions.put(HamburgerOptions.Extras.Lettuce, 10.00);
        this.pattyOption = pattyOption;
    }

    @Override
    public void printSummary() {
        super.printSummary();
        System.out.println("\t Includes " + pattyOption + " Patty option.");
    }
}

class ChickenBurger extends Hamburger {

    enum ChickenPieceOption {
        Leg,
        Breast
    }

    private ChickenPieceOption chickenPieceOption;

    public ChickenBurger(BreadType breadType, int extrasLimit, ChickenPieceOption chickenPieceOption) {
        super(breadType, extrasLimit);
        super.burgerOptions.put(HamburgerOptions.Extras.Avocado, 20.00);
        this.chickenPieceOption = chickenPieceOption;
    }

    @Override
    public void printSummary() {
        super.printSummary();
        System.out.println("\t Includes " + chickenPieceOption + " chicken piece option.");
    }
}