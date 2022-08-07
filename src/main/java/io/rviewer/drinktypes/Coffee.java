package io.rviewer.drinktypes;

public class Coffee extends Drink {
    protected String drinkName = "coffee";
    protected Double price = 0.5;

    public String getDrinkName(){
        return drinkName;
    }
    public Double getPrice(){ return  price;}
}