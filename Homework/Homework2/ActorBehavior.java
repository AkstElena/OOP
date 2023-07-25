package Homework.Homework2;

import java.util.List;

public interface ActorBehavior {

  void setMakeOrder(boolean setTade);

  void setTakeOrder(boolean setMake);

  boolean isMakeOrder(boolean isMake);

  boolean isTakeOrder(boolean isTake);

  Order makeOrder(List<String> listHuman);

}
