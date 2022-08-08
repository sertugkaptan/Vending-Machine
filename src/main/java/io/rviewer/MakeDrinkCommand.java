package io.rviewer;

import io.rviewer.drinktypes.Chocolate;
import io.rviewer.drinktypes.Coffee;
import io.rviewer.drinktypes.Drink;
import io.rviewer.drinktypes.Tea;

import java.util.Arrays;


public class MakeDrinkCommand implements Command {



  @Override
  public void execute(Input input, Output out) {
    try{
      String drinkType = input.getParameter("drinkType");


      CheckDrink checkDrink = new CheckDrink();

      Boolean isValid = Arrays.asList("COFFEE", "CHOCOLATE", "TEA").contains(drinkType.toUpperCase());
      if (isValid) {

        Float money = input.getParameter("money");
        //checks if the drink can be bought with the money
        out.run(checkDrink.checkPriceOfDrinkType(drinkType,money));
        Integer sugarsNo = input.getParameter("sugar");

        if (sugarsNo >= 0 && sugarsNo <= 2) {

          Boolean isExtraHot = input.getParameter("extraHot");
          //checks for extras in the drink
          out.run(checkDrink.checkForExtra(sugarsNo,isExtraHot,drinkType));
        } else {
          out.run("The number of sugars should be between 0 and 2.");
        }
      } else {
        out.run("The drink type should be tea, coffee or chocolate.");
      }
    }catch(Exception e){
      throw e;
    }

  }
}
