package io.rviewer;

public class CheckDrink {
    public String checkPrice(Drink drink, Float money){
        String res = new String();
        if(drink.getPrice() > money){
            res =  "The " + drink.getDrinkName() + " costs "  + drink.getPrice() + ".";
        }
        return res;
    }

    public String checkPriceOfDrinkType(String drinkType, Float money){
        String res = new String();
        if(drinkType.toUpperCase() =="TEA")
            res = checkPrice(new Tea(),money);
        if(drinkType.toUpperCase() == "COFFEE")
            res = checkPrice(new Coffee(),money);
        if (drinkType.toUpperCase() == "CHOCOLATE")
            res = checkPrice(new Chocolate(),money);
        return res;
    }

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
