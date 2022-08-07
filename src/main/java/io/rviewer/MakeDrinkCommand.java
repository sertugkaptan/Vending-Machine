package io.rviewer;

import java.util.Arrays;
import io.rviewer.Drink;


public class MakeDrinkCommand implements Command {
  public String checkPrice(Drink drink, Float money){
    String res = new String();
    if(drink.getPrice() > money){
      res =  "The " + drink.getDrinkName() + " costs "  + drink.getPrice() + ".";
    }
    return res;
  }

  public String checkPriceOfType(String drinkType, Float money){
    String res = new String();
    if(drinkType.toUpperCase() =="TEA")
      res = checkPrice(new Tea(),money);
    if(drinkType.toUpperCase() == "COFFEE")
      res = checkPrice(new Coffee(),money);
    if (drinkType.toUpperCase() == "CHOCOLATE")
      res = checkPrice(new Chocolate(),money);
    return res;
  }

  @Override
  public void execute(Input input, Output out) {
    Boolean hasStick = false;
    String drinkType = input.getParameter("drinkType");

    boolean isValid = Arrays.asList("COFFEE", "CHOCOLATE", "TEA").contains(drinkType.toUpperCase());
    if (isValid) {
      Float money = input.getParameter("money");

      out.run(checkPriceOfType(drinkType,money));

      Integer sugarsNo = input.getParameter("sugar");
      String message;

      if (sugarsNo >= 0 && sugarsNo <= 2) {
        message = "You have ordered a " + drinkType;

        Boolean isExtraHot = input.getParameter("extraHot");
        if (isExtraHot) {
          message += " extra hot";
        }

        if (sugarsNo > 0) {
          hasStick = true;
          message += " with " + sugarsNo + " sugars (stick included)";
        } else {
          message += " with " + sugarsNo + " sugar";
        }

        out.run(message);
      } else {
        out.run("The number of sugars should be between 0 and 2.");
      }

    } else {
      out.run("The drink type should be tea, coffee or chocolate.");
    }

  }
}
