package io.rviewer;

import java.util.Arrays;
import io.rviewer.Drink;


public class MakeDrinkCommand implements Command {


  @Override
  public void execute(Input input, Output out) {
    String drinkType = input.getParameter("drinkType");
    CheckDrink checkDrink = new CheckDrink();

    boolean isValid = Arrays.asList("COFFEE", "CHOCOLATE", "TEA").contains(drinkType.toUpperCase());
    if (isValid) {
      Float money = input.getParameter("money");
      out.run(checkDrink.checkPriceOfDrinkType(drinkType,money));
      Integer sugarsNo = input.getParameter("sugar");

      if (sugarsNo >= 0 && sugarsNo <= 2) {
        Boolean isExtraHot = input.getParameter("extraHot");

        out.run(checkDrink.checkForExtra(sugarsNo,isExtraHot,drinkType));

      } else {
        out.run("The number of sugars should be between 0 and 2.");
      }

    } else {
      out.run("The drink type should be tea, coffee or chocolate.");
    }

  }
}
