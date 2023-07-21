package Seminar.Seminar2;

import java.util.ArrayList;
import java.util.List;

public interface ActorBehavior {

  void setMakeOrder(boolean setTade);

  void setTakeOrder(boolean setMake);

  boolean isMakeOrder(boolean isMake);

  boolean isTakeOrder(boolean isTake);

  Order makeOrder(List<String> listHuman);

}
