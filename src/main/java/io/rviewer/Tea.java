package io.rviewer;
import io.rviewer.Drink;

public class Tea extends Drink {
    protected String drinkName = "Tea";
    protected Double price = 0.4;

    public String getDrinkName(){
        return drinkName;
    }
    public Double getPrice(){ return  price;}
}