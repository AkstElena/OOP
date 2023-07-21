package Seminar.Seminar2;

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

}
