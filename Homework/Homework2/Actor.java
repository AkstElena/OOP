package Homework.Homework2;

public abstract class Actor implements ActorBehavior {

  private String name;
  private boolean makeOrder;
  private boolean takeOrder;

  public Actor(String name, boolean makeOrder, boolean takeOrder) {
    this.name = name;
    this.makeOrder = makeOrder;
    this.takeOrder = takeOrder;

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isMakeOrder() {
    return makeOrder;
  }

  public void setMakeOrder(boolean makeOrder) {
    this.makeOrder = makeOrder;
  }

  public boolean isTakeOrder() {
    return takeOrder;
  }

  public void setTakeOrder(boolean takeOrder) {
    this.takeOrder = takeOrder;
  }

  @Override
  public String toString() {
    return "Actor: name=" + name + ", makeOrder=" + makeOrder + ", takeOrder=" + takeOrder;
  }

}
