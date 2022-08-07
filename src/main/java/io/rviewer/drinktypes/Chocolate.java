package io.rviewer.drinktypes;

public class Chocolate extends Drink {
    protected String drinkName = "chocolate";
    protected Double price = 0.6;

    public String getDrinkName(){
        return drinkName;
    }
    public Double getPrice(){ return  price;}
}