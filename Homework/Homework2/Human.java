package Homework.Homework2;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Human extends Actor {

  double money;
  Automat automat;

  public Human(String name, boolean makeOrder, boolean takeOrder, double money) {
    super(name, makeOrder, takeOrder);
    this.money = money;
  }

  @Override
  public void setMakeOrder(boolean b) {

  }

  @Override
  public void setTakeOrder(boolean b) {

  }

  @Override
  public boolean isMakeOrder(boolean b) {
    return false;

  }

  @Override
  public boolean isTakeOrder(boolean b) {
    return false;

  }

  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }

  public void setAutomat() {
    Automat automat = new Automat();
    automat.initProduct(null);
    List<Product> myList = new ArrayList<>();
    Product product1 = new Food("Twix", 80, 10, new GregorianCalendar(2023, 10, 10, 0, 0), 15);
    Product product2 = new Food("Mars", 90, 50, new GregorianCalendar(2023, 10, 10, 0, 0), 20);
    Product product3 = new Food("Snicers", 60, 15, new GregorianCalendar(2023, 10, 0, 0, 0), 15);
    myList.add(product1);
    myList.add(product2);
    myList.add(product3);
    this.automat = automat;
  }

  @Override
  public Order makeOrder(List<String> listHuman) {
    ArrayList<Product> shoppingList = new ArrayList<>();
    Product shoppingProduct;
    for (String product : listHuman) {
      shoppingProduct = automat.getProduct(product);
      if (shoppingList != null) {
        shoppingList.add(shoppingProduct);
      }
    }
    setTakeOrder(true);
    return automat.createOrder(shoppingList);
  }
}
