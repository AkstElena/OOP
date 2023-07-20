package Homework.Homework1;

import java.util.ArrayList;
import java.util.List;

public class HotBeverageAutomat extends Automat {

  List<HotBeverage> listHotBeverage = new ArrayList<>();

  public void initHotBeverage(List<HotBeverage> myList) {
    listHotBeverage = myList;
  }

  public HotBeverage getProduct(String name, Double volume, Integer temperature) {
    for (HotBeverage el : listHotBeverage) {
      if (el.getName().equals(name) & el.getTemp().equals(temperature) &
          el.getVolume().equals(volume)) {
        return el;
      }
    }
    return null;

  }

}