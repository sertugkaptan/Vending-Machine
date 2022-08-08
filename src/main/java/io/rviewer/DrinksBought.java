package io.rviewer;

import io.rviewer.drinktypes.Chocolate;
import io.rviewer.drinktypes.Coffee;
import io.rviewer.drinktypes.Tea;

public class DrinksBought {
    public Double teaNo = 0.0;
    public Double coffeeNo = 0.0;
    public Double chocolateNo = 0.0;

    public void moneyEarned(String drink){
        if(drink.toUpperCase().equals("TEA")){
            this.teaNo+=0.4;
        }
        else if(drink.toUpperCase().equals("COFFEE")) {
            this.coffeeNo+=0.5;
        }
        else {
            this.chocolateNo+=0.6;
        }
    }
}
