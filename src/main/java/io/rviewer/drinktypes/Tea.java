package io.rviewer.drinktypes;

public class Tea extends Drink {
    protected String drinkName = "tea";
    protected Double price = 0.4;

    public String getDrinkName(){
        return drinkName;
    }
    public Double getPrice(){ return  price;}
}