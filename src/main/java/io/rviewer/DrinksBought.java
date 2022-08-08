package io.rviewer;

import io.rviewer.drinktypes.Chocolate;
import io.rviewer.drinktypes.Coffee;
import io.rviewer.drinktypes.Tea;

public class DrinksBought {
    public Integer teaNo = 0;
    public Integer coffeeNo = 0;
    public Integer chocolateNo = 0;

    public void moneyEarned(String drink){
        if(drink.toUpperCase().equals("TEA"))
            this.teaNo++;
        else if(drink.toUpperCase().equals("COFFEE"))
            this.coffeeNo++;
        else
            this.chocolateNo++;
    }
}
