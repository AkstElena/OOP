import java.util.List;

public class GenericBox<T extends Fruit> implements Comparable<GenericBox<? extends Fruit>> {

  private List<T> listofItems;

  public GenericBox(List<T> listofItems) {
    this.listofItems = listofItems;
  }

  public List<T> getListofItems() {
    return listofItems;
  }

  public void addItem(T item) {
    this.listofItems.add(item);
  }

  public double boxWeight() {
    double totalWeight = 0;
    for (T item : listofItems) {
      totalWeight += item.getWeight();
    }
    return totalWeight;
  }

  public int compareTo(GenericBox<? extends Fruit> otherBox) {
    return (int) (boxWeight() - otherBox.boxWeight());
  }

  @Override
  public String toString() {
    return "GenericBox [" + listofItems + "]";
  }

}
