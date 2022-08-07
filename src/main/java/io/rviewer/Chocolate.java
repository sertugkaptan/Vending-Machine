package io.rviewer;
import io.rviewer.Drink;

public class Chocolate extends Drink {
    protected String drinkName = "Chocolate";
    protected Double price = 0.6;

    public String getDrinkName(){
        return drinkName;
    }
    public Double getPrice(){ return  price;}
}