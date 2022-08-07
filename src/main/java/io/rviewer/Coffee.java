package io.rviewer;

import io.rviewer.Drink;

public class Coffee extends Drink {
    protected String drinkName = "Coffee";
    protected Double price = 0.5;

    public String getDrinkName(){
        return drinkName;
    }
    public Double getPrice(){ return  price;}
}