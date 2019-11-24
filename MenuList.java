/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
class MenuList {

    private int friedchicken, cheesechicken, spicychicken, nuggets, frenchfries, berger, coke, pepsi, drink;

    public MenuList(int friedchicken, int cheesechicken, int spicychicken, int nuggets, int frenchfries, int berger, int coke, int pepsi, int drink) {
        this.friedchicken = friedchicken;
        this.cheesechicken = cheesechicken;
        this.spicychicken = spicychicken;
        this.nuggets = nuggets;
        this.frenchfries = frenchfries;
        this.berger = berger;
        this.coke = coke;
        this.pepsi = pepsi;
        this.drink = drink;
        
        
    }

    public int getFriedchicken() {
        return friedchicken;
    }

    public int getCheesechicken() {
        return cheesechicken;
    }

    public int getSpicychicken() {
        return spicychicken;
    }

    public int getNuggets() {
        return nuggets;
    }

    public int getFrenchfries() {
        return frenchfries;
    }

    public int getBerger() {
        return berger;
    }

    public int getCoke() {
        return coke;
    }

    public int getPepsi() {
        return pepsi;
    }

    public int getDrink() {
        return drink;
    }
}
