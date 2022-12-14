package io.rviewer;

import io.rviewer.drinktypes.Chocolate;
import io.rviewer.drinktypes.Coffee;
import io.rviewer.drinktypes.Drink;
import io.rviewer.drinktypes.Tea;

public class CheckDrink {

    //Checks whether the drink can be bought with the money
    public String checkPrice(Drink drink, Float money){
        String res = new String();
        if(drink.getPrice() > money){
            res =  "The " + drink.getDrinkName() + " costs "  + drink.getPrice() + ".";
        }
        return res;
    }

    //Checks the type of drink then checks the price of the drink
    public String checkPriceOfDrinkType(String drinkType, Float money){
        String res = new String();
        if(drinkType.toUpperCase().equals("TEA"))
            res = checkPrice(new Tea(),money);
        else if(drinkType.toUpperCase().equals("COFFEE"))
            res = checkPrice(new Coffee(),money);
        else if (drinkType.toUpperCase().equals("CHOCOLATE"))
            res = checkPrice(new Chocolate(),money);
        return res;
    }

    //Checks if there are any extras then adds it to a message
    public String checkForExtra(Integer sugarsNo,Boolean isExtraHot,String drinkType){
        String message = "You have ordered a " + drinkType;

        if (isExtraHot) {
            message += " extra hot";
        }

        if (sugarsNo > 0) {
            message += " with " + sugarsNo + " sugars (stick included)";
        } else {
            message += " with " + sugarsNo + " sugar";
        }

        return message;
    }
}
