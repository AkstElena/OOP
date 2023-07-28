public abstract class Fruit {

  public Fruit(double weight) {
    this.weight = weight;
  }

  private double weight;

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "weight=" + weight;
  }

}
